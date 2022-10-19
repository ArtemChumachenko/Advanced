package homeWork7;

public class Director extends Manager{
    public Director(String name, int numberOfSubordinates) {
        super (name, numberOfSubordinates);
    }

    @Override
    public int getSalary() {
        int salary;
        if (getNumberOfSubordinates () == 0) {

            return  (salary = super.getBaseSalary ());
        } else {

            return (salary =(int)(super.getBaseSalary () * (1.0 * getNumberOfSubordinates () / 100 * 9)));
        }

    }

    @Override
    public String toString() {
        return "Director " + getName () + ":" + " number of subordinates " + getNumberOfSubordinates () + "; salary " +
                " " + getSalary ();
    }
}
