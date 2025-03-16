package Lesson33.Person;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TestExamples {

    @BeforeEach
    void setUp(){
        System.out.println("Before Each");
    }
    //AfterEach - после каждого
    //AfterAll - один ращ после всех
    /*
    @disabled - отключенный тест
     */



    @Test
    public void testAddition(){
        System.out.println("test addiction");
        int result = 2 + 3;
        Assertions.assertEquals(5 , result);//равны ли два значения
        Assertions.assertNotEquals(0 ,result);// не равны ли два значения
        Assertions.assertTrue(result >= 4);
        assertEquals(10, 5 + 5);
        assertFalse(result > 10);
        assertNull(null);
        assertNotNull("String");

    }
    public void emptyTest(){
        System.out.println("Test empty");
    }
    @ParameterizedTest
    @ValueSource(strings = {"apple" , "banana","kiwi" , "chery"})
    public void testFruits(String fruit){
        System.out.println(fruit);
        assertNotNull(fruit);
        assertTrue(fruit.length()> 4);
    }

  /*  @ParameterizedTest
    @ValueSource(ints = {1 ,2})
    void testStatic (int value){
        Autobus bus = new Autobus("Test" , 10 ,);

    }

   */
    @ParameterizedTest
    @MethodSource("testDataFruits")
    void testMethodSourceFruits(String fruit){
        System.out.println("Current value" + fruit);
        assertNotNull(fruit);

    }
    static Stream<String> testDataFruits(){
        return Stream.of("apple" , "banana","kiwi" , "chery");
    }
    @ParameterizedTest
    @MethodSource("testDataInt")
     void testMethodSourceInt(int value){
        System.out.println("caurrent value: " + value);
        assertNotEquals(100 , value);

    }

    static Stream<Integer> testDataInt(){
      return Stream.of(1,2,-10,0,15);

    }

    @ParameterizedTest
    @MethodSource("testDataArguments")
    void testMethodSourceArguments(int value , int expected , boolean isEquals){
        System.out.println(value + " | " + isEquals + " | " + expected);
        int result = value * value;
        assertEquals(expected , result);


    }
    static Stream<Arguments> testDataArguments(){
        return Stream.of(
                Arguments.of(2,4,true),
                Arguments.of(3,9,true),
                Arguments.of(4,16,true)


        );
    }
    @ParameterizedTest
    @MethodSource("testPersonData")
    void testMethodSourcePerson(Person person , String newEmail){
        System.out.println("Current value: " + person);
        System.out.println("New email: " +  newEmail);

    }
    static Stream<Arguments> testPersonData(){
        Person person = new Person("test@email.com" , "PasswW1%" );
        return Stream.of(
          Arguments.of(person , "new1234#mail.com"),
          Arguments.of(new Person(("invalid.mail.com") , "password") , "pass.com")) ;


    }















}