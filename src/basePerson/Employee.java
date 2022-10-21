package basePerson;

public abstract class Employee extends BasePerson{

    private int salary;


    public Employee(String name, int age) {
    super(name, age);
    }

    public abstract void getSalary();

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
