package ru.dlatsuga.store;

import org.junit.Ignore;
import org.junit.Test;
import ru.dlatsuga.models.Message;
import ru.dlatsuga.models.Role;
import ru.dlatsuga.models.User;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Dima on 29.06.2015.
 */
public class HibernateStorageTest {

    @Ignore
    @Test
    public void testCreate() throws Exception {
        final HibernateStorage storage = new HibernateStorage();
        final int id = storage.add(new User(-1, "hibernateTest", null));
        final User user = storage.get(id);
        assertEquals(id, user.getId());
//        assertEquals(id, storage.findByLogin("hibernateTest").getId());
        storage.delete(id);
        assertNull(storage.get(id));
        storage.close();
    }

    @Test
    public  void  testCreateUser() throws  Exception{

        final HibernateStorage storage = new HibernateStorage();
        Role role = new Role();
        role.setName("admin");
        User user = new User();
        user.setLogin("test");
        user.setEmail("test@test");
        user.setRole(role);
        final int id = storage.add(user);
        user = storage.get(id);
        Message message = new Message();
        message.setUser(user);
        message.setText("text");
        HashSet<Message> messages = new HashSet<Message>();
        messages.add(message);
        user.setMessages(messages);
        storage.edit(user);
        assertEquals(1, storage.get(id).getMessages().size());
        storage.delete(id);
        storage.close();
    }
}