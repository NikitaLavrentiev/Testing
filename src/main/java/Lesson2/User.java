package Lesson2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class User {
    private String login;
    private String email;

    public User(String login, String email) {
        if (!login.equals(email)) {
            setEmail(email);
            setLogin(login);
        } else {
            throw new IllegalArgumentException("Почта и логин должны отличаться");
        }
    }

    public User() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        if (!login.equals(null) && !login.isBlank() && !login.isEmpty()) {
            this.login = login;
        } else {
            throw new IllegalArgumentException("Некорректно указан логин");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws IllegalArgumentException {
        if (checkEmail(email)) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Некорректно указана почта");
        }

    }

    public boolean checkEmail(String email) {
        if (!email.equals(null) && !email.isBlank() && !email.isEmpty()) {

            char check[] = email.toCharArray();
            if (Arrays.asList(check).contains('@'))
            return true;
            if (Arrays.asList(check).contains('.')){

                return true;}
        }
        return false;
    }
}

