package ru.dlatsuga.store;

import ru.dlatsuga.models.User;

import java.util.Collection;

/**
 * Created by Dima on 21.06.2015.
 */
public interface Storage {

        public Collection<User> values();

        public int add(final User user);

        public void edit(final User user);

        public void delete(final int id);

        public User get(final int id);

        public User findByLogin(final String login) ;

        public int generateId();

        public void close();

}
