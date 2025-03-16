package Lesson33.Person;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

    public class PersonTest {
        Person person;
        String startEmail = "john@test.com";
        String startPassword = "qwerty1Q%S";
        @BeforeEach
        void setUp(){
            person = new Person(startEmail , startPassword);

        }

        @ParameterizedTest
        @ValueSource(strings = {"valid@test.com", "test111@test.com.de"})
        void testValidEmailSet(String validEmail){
            person.setEmail(validEmail);
            Assertions.assertEquals(validEmail , person.getEmail());

        }

        @ParameterizedTest
        @ValueSource(strings = {
                "user@@example.com",       // Две собаки
                "user.example.com",        // Нет @
                "user@com",                // Нет точки после @
                "@example.com",            // Нет имени пользователя
                "user@ex!ample.com",       // Недопустительный спецсимвол в домене
                "user@ example.com",       // Пробел в адрес
                "user@example.com ",       // Пробел в конце
                " user@example.com",       // Пробел в начале

        })
      void testInvalidEmail(String invalidEmail){
            person.setEmail(invalidEmail);
            Assertions.assertNotEquals(invalidEmail , person.getEmail());
        }

        @ParameterizedTest
        @ValueSource(strings = {
                "Aiy1_-1",//меньше 8
                "Aiya_-a",//цифра
                "AIIII1_-1",//маленькая буква
                "aiy1_-1",//большая
                "Aiy1aaaa1"// спецсимвол
        })
        void tetsInvalidPassword(String invalidPass){
            person.setPassword(invalidPass);
            Assertions.assertNotEquals(invalidPass , person.getPassword());
        }

        @ParameterizedTest
        @ValueSource(strings = {
                "Andriy1_-1",
                "aNdriy1_-1",
                "Andriy1_-o",
                "Pass_word1-",
                "123Qwerty-"

        })
        void testValidPassword(String validPssword){
            person.setPassword(validPssword);
            Assertions.assertEquals(validPssword , person.getPassword());

        }













}
