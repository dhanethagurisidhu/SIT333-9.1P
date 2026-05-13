package web.service;

import org.junit.Assert;
import org.junit.Test;

public class LoginServiceTest {

    @Test
    public void testValidLogin() {

        LoginService service = new LoginService();

        boolean result =
                service.validateLogin(
                        "student@deakin.edu.au",
                        "123456");

        Assert.assertTrue(result);
    }

    @Test
    public void testInvalidLogin() {

        LoginService service = new LoginService();

        boolean result =
                service.validateLogin(
                        "wrong@gmail.com",
                        "wrong");

        Assert.assertFalse(result);
    }

    @Test
    public void testNullLogin() {

        LoginService service = new LoginService();

        boolean result =
                service.validateLogin(null, null);

        Assert.assertFalse(result);
    }
}