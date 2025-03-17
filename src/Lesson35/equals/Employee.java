package Lesson35.equals;

import java.util.Objects;

public class Employee {
    private  String firstName;
    private String lastName;
    private String dateOfBirth;

    public Employee(String firstName, String lastName, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }

 /*   @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Employee)) return false;
        Employee employee = (Employee) obj;
       // return firstName.equals(employee.firstName) && lastName.equals(employee.lastName) && dateOfBirth.equals(employee.dateOfBirth);
        return Objects.equals(firstName,employee.firstName  )&&
                Objects.equals(lastName , employee.lastName)&&
                Objects.equals(dateOfBirth , employee.dateOfBirth);
    }

  */

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(dateOfBirth, employee.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, dateOfBirth);
    }
}
