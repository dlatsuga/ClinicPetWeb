package ru.dlatsuga.models;

/**
 * Created by Dima on 21.06.2015.
 */
public class User extends Base {
    private String login;
    private String email;
//    private Role role;

    public User(){}

    public User(final int id, final String login, final String email) {
        this.id = id;
        this.login = login;
        this.email = email;
    }

    public String getLogin() {
        return this.login;
    }

    public String getEmail() {
        return this.email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
