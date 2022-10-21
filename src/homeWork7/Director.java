package homeWork7;

public final class Director extends Manager implements IManager{

     public Director(String name, int age, char sex, int salaryPerDay, int numberOfSubordinates) {
     super (name, age, sex, salaryPerDay, numberOfSubordinates);
    }


    @Override
    public int getNumberOfSubordinates() {
        return 0;
    }

    @Override
    public int getSalary(Month[] arr) {
        int salary = 0;
        for (Month month : arr) { //Для всех значений month которые имеют тип Month, из массива arr делаем следующее:
            if (getNumberOfSubordinates() == 0) {
                return getSalaryPerDay() * month.getAmountOfWorkDays() * SALARY_COEFFICIENT_DIRECTOR;
            } else {
                salary += getSalaryPerDay() * month.getAmountOfWorkDays() * getNumberOfSubordinates() / 100 * SALARY_COEFFICIENT_DIRECTOR;
            }
        }
        return salary;
    }



}



