package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdminUserTest {

    @Test
    void testCreate(){
        AdminUser adminUser = new AdminUser("admin@gmail.com","12345");
        assertEquals("admin@gmail.com",adminUser.getUserEmail());
        assertEquals("*****",adminUser.getPassword());
    }

}