package month;

public class Employee {
    private String name;
    private int age;
    private char sex;
    private int salaryPerDay;

    public Employee(String name, int age, char sex, int salaryPerDay) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.salaryPerDay = salaryPerDay;
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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getSalaryPerDay() {
        return salaryPerDay;
    }

    public void setSalaryPerDay(int salaryPerDay) {
        this.salaryPerDay = salaryPerDay;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", salaryPerDay=" + salaryPerDay +
                '}';
    }

    public int getSalary(Month[] arr) {
          int salary = 0;
          for (Month month : arr) {
              salary += getSalaryPerDay () * month.getAmountOfWorkDays ();

        }
          return salary;

    }


}
