package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NormalUserTest {
    @Test
    void testCreate(){
        NormalUser normalUser = new NormalUser("normal@gmail.com","12345");
        assertEquals("normal@gmail.com",normalUser.getUserEmail());
        assertEquals("12345",normalUser.getPassword());
    }

}