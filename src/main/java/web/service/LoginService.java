package web.service;

public class LoginService {

    public boolean validateLogin(String email, String password) {

        if(email == null || password == null) {
            return false;
        }

        if(email.equals("student@deakin.edu.au")
                && password.equals("123456")) {
            return true;
        }

        return false;
    }
}