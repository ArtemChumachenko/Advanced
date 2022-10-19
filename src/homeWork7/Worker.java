package homeWork7;

public class Worker extends Employee{

    public Worker(String name) {
        super (name);
    }

    @Override
    public int getSalary() {
        return super.getBaseSalary ();
    }

    @Override
    public String toString() {
        return "Worker " + getName () + ":" + "; salary " +
                " " + getBaseSalary ();
    }
}
