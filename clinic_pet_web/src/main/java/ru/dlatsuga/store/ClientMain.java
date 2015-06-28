package ru.dlatsuga.store;

import ru.dlatsuga.models.User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Dima on 27.06.2015.
 */
public class ClientMain {
    public static void main(String[] args) {
        ClientCashe clientCashe = new ClientCashe();
        Collection<User> userList = new ArrayList<>();

        userList = clientCashe.values();

        System.out.println("id     :   name");
        System.out.println("...............");
        for (User user : userList) {
            System.out.println(user.getId() + "      :   " + user.getLogin());
        }
    }
}
