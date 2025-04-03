package Lesson48.homework;

public class Student {
    private String name;
    private int age;
    private String major;//специальность
    private int year; // курс
    private double grade;// Средняя оценка

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", major='" + major + '\'' +
                ", year=" + year +
                ", grade=" + grade +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public Student(String name, int age, String major, int year, double grade) {
        this.name = name;
        this.age = age;
        this.major = major;
        this.year = year;
        this.grade = grade;
    }
}
