package homeWork;
// Создать класс в котором будут поля Имя, Возраст, Страна, Зарплата (цифрами просто), образование (Bachelor, PhD и тд).
// Создать во ВТОРОМ классе около 10 человек (минимум 8 ) и использовать методы первого класса.
// Сделать сортировки по всем параметрам(например сначала выводит тех кто из США, потом кто из Японии и тд).
//На основе данной задачи, будут еще по мере продвижения по темам. Опционально к выполнению,
// так как задача будет похожая в домашке.

import java.time.Year;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Human {
    private String name;
    private char sex;
    private int yearOfBirth;
    protected String country;
    private int salary;
    private String degree;


    public Human(String name, char sex, int yearOfBirth, String country, int salary, String degree) {
        this.name = name;
        this.sex = sex;
        this.yearOfBirth = yearOfBirth;
        this.country = country;
        this.salary = salary;
        this.degree = degree;
    }

    public String getName() {
        if (sex == 'M') {
            return ("Mr " + this.name);
        } else {
            return ("Ms " + this.name);
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Year.now ().getValue () - yearOfBirth;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", yearOfBirth=" + yearOfBirth +
                ", country='" + country + '\'' +
                ", salary=" + salary +
                ", degree='" + degree + '\'' +
                '}';
    }

    public static void printCountry(Human[] ppl, String country) {
        StringBuilder stringBuilder = new StringBuilder ();
        for (Human human : ppl)
            if (human.getCountry ().equals (country)) stringBuilder.append (human.getName () + " ");
        System.out.println (stringBuilder);

    }

    public static void printDegree(Human[] ppl, String degree) {
        for (int i = 0; i < ppl.length; i++) {
            if (degree.equals (ppl[i].getDegree ())) {
                System.out.println (ppl[i].toString ());
            }
        }
    }

//    public static void sortHuman(Human array) {
//        Arrays.sort (array, Comparator.comparing (Human::getSalary));
//        System.out.println (Arrays.toString (array));
//        Arrays.sort (array, Comparator.comparing (Human::getName));
//        System.out.println (Arrays.toString (array));
//        Arrays.sort (array, Comparator.comparing (Human::getCountry));
//        System.out.println (Arrays.toString (array));
//
//    }
}

