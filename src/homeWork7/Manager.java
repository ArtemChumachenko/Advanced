package homeWork7;

public class Manager extends Employee{
    private int numberOfSubordinates;

    public Manager(String name, int numberOfSubordinates) {
        super (name);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public String toString() {
        return "Manager1 " + getName () + ":" + " number of subordinates " + numberOfSubordinates + "; salary " +
                " " + getSalary ();
    }

    @Override
    public int getSalary() {

        int salary;
        if (numberOfSubordinates == 0) {

       return  (salary = super.getBaseSalary ());
        } else {

            return (salary =(int)(super.getBaseSalary () * (1.0 * numberOfSubordinates / 100 * 3)));
        }

    }
}
