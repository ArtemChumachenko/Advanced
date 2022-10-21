package homeWork7;

public interface IManager extends IEmployee {
    int SALARY_COEFFICIENT = 2;
    int SALARY_COEFFICIENT_DIRECTOR = 4;
    int getNumberOfSubordinates();
    int getSalary(Month[] arr);

}
