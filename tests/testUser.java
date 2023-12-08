package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import src.repository.User;
import src.repository.UserRepository;

public class testUser {

    @Test
    void testDelogger () {
        UserRepository rep = new UserRepository();
        for(int i = 0; i < 10; i++) {
            User user = new User(null, null, false);
            rep.addUser(user);
        }

        User admin = new User(null, null, true);
        rep.addUser(admin);

        // Check addUser method.
        assertEquals(rep.getDataList().size(), 11);

        // Check the working of delogger method.
        rep.delogger();
        assertEquals(rep.getDataList().size(), 1);
    }
}
