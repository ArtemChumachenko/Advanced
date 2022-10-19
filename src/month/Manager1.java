package month;

public class Manager1 extends Employee{

    private int numberOfSubordinates;

     public Manager1(String name, int age, char sex, int salaryPerDay, int numberOfSubordinates) {
        super (name, age, sex, salaryPerDay);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public int getSalary(Month[] arr) {
        int salary = 0;
        for (Month month : arr) {
            if (numberOfSubordinates == 0) {
                return super.getSalary (arr);
            } else  {
                salary += getSalaryPerDay () * month.getAmountOfWorkDays ()  ;
            }
        }
        return (salary + salary * numberOfSubordinates / 100);

    }

    @Override
    public String toString() {
        return "Manager " + getName () + " is " + getAge () + " years old" +
                 " has " + numberOfSubordinates + " number of subordinates ";
    }
}
