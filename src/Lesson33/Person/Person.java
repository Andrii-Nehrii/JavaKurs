package Lesson33.Person;

import java.io.StringWriter;

public class Person {
    private String email;
    private  String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (isEmailvalid(email)) {
            this.email = email;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
       if (isPasswordValid(password)){
           this.password = password;
       }
    }

    public Person(String email, String password) {
        setEmail(email);
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
    private boolean isEmailvalid(String email){
        int  indexAt = email.indexOf('@');
        int lastAt = email.lastIndexOf('@');
        if (indexAt == -1 || indexAt != lastAt) return false;
        int dotIndexAfterAt = email.indexOf('.' , indexAt + 1);
       // System.out.println(email.indexOf('.' , indexAt + 1));
        if (dotIndexAfterAt == - 1) return false;
        int lastdDotIndex = email.lastIndexOf('.');
        if (lastdDotIndex >= email.length() - 2)return false;
        //4.
        for (char ch : email.toCharArray()){
            boolean isPass =Character.isAlphabetic(ch) || Character.isDigit(ch) || ch == '-' || ch == '_' || ch == '.' || ch =='@';
            if (!isPass) return false;
        }

            //5
            if (indexAt == 0) return false;
            //6.
           if (!Character.isLetter(email.charAt(0))) return false  ;


        return true;



    }
    private boolean isPasswordValid(String password){
        String specialSymbol = "!%$@&*,.-";
        boolean hasDigit = false;
        boolean lower = false;
        boolean upper = false;
        boolean special = false;

        if (password.length() < 8) return false;
        for (char ch : password.toCharArray()){
            if (Character.isDigit(ch)) hasDigit = true;//!
            if (Character.isLowerCase(ch)) lower = true ;//!
            if (Character.isUpperCase(ch)) upper = true;
            if (specialSymbol.contains(String.valueOf(ch))) special = true;


        }
        return hasDigit && lower && upper && special;





    }





}
