package Lesson2;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    /*
    1. Создайте проект и добавьте в него библиотеку JUnit.
    2. Создайте класс UserTest и класс User с полями логин и email. Класс «User» нужно будет тестировать.
    3. В классе UserTest пропишите следующие тесты:
    Создайте тест, который выполнит тестирование создания объекта User с передачей в него двух параметров.
    Такая функция лишь должна проверять устанавливаются ли данные при создании объекта;
    Создайте аналогичный тест, который выполнит тестирование по созданию объекта без передачи в него параметров;

    Создайте тест, который протестирует установлен ли корректный Email адрес в поле email в классе User.
    Некорректным будет считаться тот email, в котором нет знака @ или же знака точки.

    Создайте тест, который определяет, равны ли login и email (Они не должны быть равны).*/
    private final String LOGIN_EXAMPLE = "mojito";
    private final String EMAIL_EXAMPLE = "Chicky@bombony.com";
    private final String EMAIL_FAIL = "Chickybombonycom";

    User test = new User();

    /**
     * тест проверяет устанавливаются ли данные при создании объекта
     */
    @Test
    public void createUser() {
        test = new User(LOGIN_EXAMPLE, EMAIL_EXAMPLE);
        Assertions.assertEquals(LOGIN_EXAMPLE, test.getLogin());
        Assertions.assertEquals(EMAIL_EXAMPLE, test.getEmail());
    }

    /**
     * тест, который выполнит тестирование по созданию объекта без передачи в него параметров
     */
    @Test
    public void createVoidUser() {
        test = new User();
        Assertions.assertNull(test.getEmail());
        Assertions.assertNull(test.getLogin());
    }

    /**
     * тест, который протестирует установлен ли корректный Email адрес в поле email в классе User.
     *     Некорректным будет считаться тот email, в котором нет знака @ или же знака точки.
     */
    @Test
    public void shouldThrowIllegalArgumentExceptionIfEmailInvalid() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> test.setEmail(EMAIL_FAIL));
    }

    /**
     * тест, который определяет, равны ли login и email (Они не должны быть равны)
     */

    @Test
    public void shouldThrowIllegalArgumentExceptionIfEmailIsEqualLogin() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> {
                    test.setEmail(EMAIL_EXAMPLE);
                    test.setLogin(EMAIL_EXAMPLE);
                });
    }
}