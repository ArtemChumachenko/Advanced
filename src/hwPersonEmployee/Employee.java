package hwPersonEmployee;

public class Employee extends Person {
    private int salary;


    public Employee(String name, char sex, int yearOfBirth,int salary) {
        super (name, sex, yearOfBirth, salary);
        this.salary = salary;
    }

    @Override
    public String getName() {
        if (getSex () == 'M') {
            return ("Mr. " + super.getName ());
        } else {
            return ("Ms. " + super.getName ());
        }
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee : " + "name - " + super.getName () + " sex - " + super.getSex () + " age - " +
                super.getAge () + " salary - " + salary;

    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public boolean isSameName(Employee employee) {
       if(super.getName ().equals (employee.getName ())){
           return true;
       }
       return false;
    }
}
