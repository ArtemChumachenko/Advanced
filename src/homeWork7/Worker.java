package homeWork7;

public final class Worker extends BaseEmployee implements IEmployee{

    public Worker(String name, int age, char sex, int salaryPerDay) {
        super (name, age, sex, salaryPerDay);
    }

    @Override
    public int getSalary(Month[] arr) {
        int salary = 0;
        for (Month month : arr) { //Для всех значений month которые имеют тип Month, из массива arr делаем следующее:
            salary += getSalaryPerDay() * month.getAmountOfWorkDays();
        }
        return salary;
    }
}

