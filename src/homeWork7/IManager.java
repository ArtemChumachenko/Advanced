package homeWork7;

public interface IManager {
    int SALARY_COEFFICIENT = 2;
    int SALARY_COEFFICIENT_DIRECTOR = 4;
    public int getNumberOfSubordinates() ;

    public void setNumberOfSubordinates(int numberOfSubordinates) ;

    public int getSalary(Month[] arr) ;

}
