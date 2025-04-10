package Lesson49.validator;

/**
 * @author Sergey Bugaenko
 * {@code @date} 04.04.2025
 */


// extends RuntimeException = для НЕ-проверяемых исключений
// extends Exception -  для проверяемых исключения
public class EmailValidateException extends Exception {

    /*
    getMessage() - возвращает строку с коротким описанием исключения
    getCause() - возвращает исключение, которое вызвало текущее исключение
    toString() - строковое представление исключения
    printStackTrace() - выводит трассировку исключения
     */

    public EmailValidateException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Email validate exception | " +  super.getMessage();
    }
}
/*
  public void setEmail(String email) {

        try {
            PersonValidator.validateEmail(email);
            System.out.println("Email прошел проверку");
            this.email = email;
        } catch (EmailValidateException ex) {
            System.out.println("Вы ввели некорректный email: " + ex.getMessage());
        }
    }
 */
