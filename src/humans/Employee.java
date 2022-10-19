package humans;

import java.time.Year;

public class Employee extends Person  {
        private int salary;

    public Employee(String name, char sex, int yearOfBirth, int salary) {
        super (name, sex, yearOfBirth);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
