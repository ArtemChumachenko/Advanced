package month;



import static homeWork7.EmployeeUtilities.*;
import static homeWork7.MonthUtils.*;


public class Main {


    public static void main(String[] args) {
        Employee john = new Employee ("John", 23, 'M', 200);
        System.out.println (john.getSalary (getMonthArray()));
        Manager1 nick = new Manager1 ("Nick", 25,'M',200,50);
        System.out.println (nick.getSalary (getMonthArray ()));

        System.out.println (nick.toString ());
        findMinMaxSubordinaries (getManagers ());




    }
}