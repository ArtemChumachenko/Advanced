package homeWork7;

import homeWork7.*;
import homeWork7.Manager;


public class EmployeeUtilities {

    public static IManager[] managers = {
            new Manager ("Alex",25,'M',250,35 ),
            new Manager ("Anna",28,'F',250,45),
            new Manager ("Bella", 29,'F',250, 38),
            new Manager ("Bill", 35,'M',250,59),
    };

    public static IManager[] getManagers() {
        return managers;
    }

    public static void findMinMaxSubordinaries(IManager[] array) {
        int minSub = array[0].getNumberOfSubordinates ();
        int maxSub = array[0].getNumberOfSubordinates ();

        for (int i = 0; i < array.length; i++) {
            if (array[i].getNumberOfSubordinates() < minSub) {
                minSub = array[i].getNumberOfSubordinates();
            }
            if (array[i].getNumberOfSubordinates() > maxSub) {
                maxSub = array[i].getNumberOfSubordinates();
            }

        }
        System.out.println ("Max quantity of subordinates:" + maxSub);
        System.out.println ("Min quantity of subordinates:" + minSub);
    }
    public static void findAddValue(IManager[] array, Month[] array1) {


    }

}
