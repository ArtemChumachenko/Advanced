package month;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static month.EmployeeUtilities.*;
import static month.MonthUtils.*;


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