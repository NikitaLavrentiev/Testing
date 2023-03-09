package Lesson2;

public class User {
    private String login;
    private String email;

    public User(String login, String email) {
            setEmail(email);
            setLogin(login);
    }

    public User() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        if (!login.equals(null) && !login.isBlank() && !login.isEmpty() && !login.equals(email)) {
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
        if (!email.equals(null) && !email.isBlank() && !email.isEmpty() && !email.equals(login)) {
            char check[] = email.toCharArray();
            for (int i = 0; i <= check.length-1 ; i++) {
                if (check[i] == '@') {
                    return true;
                }
                if (check[i] == '.') {
                    return true;
                }
            }

   /*  не работающий вариант проверки на наличие символов в почте
          char check[] = email.toCharArray();
            if (Arrays.asList(check).contains('@'))
            return true;
            if (Arrays.asList(check).contains('.')){
                   return true;
        }
    */
        }
            return false;
        }

    }


