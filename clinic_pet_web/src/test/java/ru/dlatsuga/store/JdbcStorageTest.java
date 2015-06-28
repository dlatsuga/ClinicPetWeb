package ru.dlatsuga.store;

import org.junit.Test;
import ru.dlatsuga.models.User;

import static org.junit.Assert.*;

/**
 * Created by Dima on 27.06.2015.
 */
public class JdbcStorageTest {

    @Test
    public void testCreate() throws Exception {
        final JdbcStorage storage = new JdbcStorage();
        final int id = storage.add(new User(-1, "test", null));
        final User user = storage.get(id);
        assertEquals(id, user.getId());
        storage.close();
    }
}