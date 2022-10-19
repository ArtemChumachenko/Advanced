package basePerson;

public class Employee extends BasePerson{

    private int salary;


    public Employee(String name, int age) {
    super(name, age);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
