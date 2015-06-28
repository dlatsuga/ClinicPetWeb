package ru.dlatsuga.store;

import ru.dlatsuga.models.User;
import ru.dlatsuga.service.Settings;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Dima on 27.06.2015.
 */
public class ClientCashe {

    private final Connection connection;

    public ClientCashe(){
        final Settings settings = Settings.getInstance();
        try{
            Class.forName("org.postgresql.Driver");
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        try {
            this.connection = DriverManager.getConnection(settings.value("jdbc.url"),settings.value("jdbc.username"),settings.value("jdbc.password"));
        }
        catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }

    public Collection<User> values() {

        final List<User> users = new ArrayList<User>();
        try(final Statement statement = this.connection.createStatement();
            final ResultSet resultSet = statement.executeQuery("select * from client")){
            while (resultSet.next()){
                users.add(new User(resultSet.getInt("uid"), resultSet.getString("name"), null));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

}
