package humans;

import java.time.Year;

public class Person {

    private String name;
    private char sex;
    private int yearOfBirth;
    private Person mother;
    private Person father;

//    private int yearOfBirth;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, char sex, int yearOfBirth) {
        this(name);
        this.sex = sex;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }


    public int getAge() {
        return Year.now ().getValue () - yearOfBirth;

    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
    public void printName() {
        System.out.println (this.getName ());
    }

    public void setMother(String mary, char f, int i) {
        this.mother = mother;
    }

    public Person getMother() {
        return mother;
    }

    public void setFather(String jake, char m, int i) {
        this.father = father;
    }

    public Person getFather() {
        return father;
    }
}
