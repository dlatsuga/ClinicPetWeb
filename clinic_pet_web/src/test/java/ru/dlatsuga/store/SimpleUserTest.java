package ru.dlatsuga.store;

import ru.dlatsuga.models.*;


/**
 * Created by Dima on 29.06.2015.
 */
public class SimpleUserTest {
    public static void main(String[] args) {
        final HibernateStorage storage = new HibernateStorage();
        Role role = new Role();
        role.setName("admin");
        User user = new User();
        user.setLogin("test");
        user.setEmail("test@test");
        user.setRole(role);
        final int id = storage.add(user);
        System.out.println(id);
    }
}
