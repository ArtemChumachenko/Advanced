package hwPersonEmployee;

import java.util.Calendar;

public class Person {
    private String name;
    private int age;
    private char sex;
    private int yearOfBirth;

    public Person(String name, char sex, int yearOfBirth, int salary) {
        this.name = name;
        this.sex = sex;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        this.age = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth;
        return age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "BasePerson :" +
                " name = " + name +
                " age = "  + getAge ()+
                " sex = " + sex +
                " yearOfBirth = " + yearOfBirth;
    }
}

