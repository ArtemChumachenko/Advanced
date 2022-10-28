package homeWork7;

public class Manager extends BaseEmployee implements IManager {
    private int numberOfSubordinates;

    public Manager(String name, int age, char sex, int salaryPerDay, int numberOfSubordinates) {
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
        for (Month month : arr) { //Для всех значений month которые имеют тип Month, из массива arr делаем следующее:
            if (numberOfSubordinates == 0) {
                return getSalaryPerDay() * month.getAmountOfWorkDays() * SALARY_COEFFICIENT;
            } else {
                salary += getSalaryPerDay() * month.getAmountOfWorkDays() * numberOfSubordinates / 100 * SALARY_COEFFICIENT;
            }
        }
        return salary;
    }



    @Override
    public String toString() {
        return "Manager " + getName () + " is " + getAge () + " years old" +
                " has " + numberOfSubordinates + " number of subordinates ";
    }


}