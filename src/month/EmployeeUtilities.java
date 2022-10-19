package month;

public class EmployeeUtilities {

    public static Manager1[] managers = {
            new Manager1 ("Alex",25,'M',250,35 ),
            new Manager1 ("Anna",28,'F',250,45),
            new Manager1 ("Bella", 29,'F',250, 38),
            new Manager1 ("Bill", 35,'M',250,59),
    };

    public static Manager1[] getManagers() {
        return managers;
    }

    public static void findMinMaxSubordinaries(Manager1[] array) {
        int minSub = array[0].getNumberOfSubordinates ();
        int maxSub = array[0].getNumberOfSubordinates ();

        for (int i = 0; i < array.length; i++) {
            if (array[i].getNumberOfSubordinates () < minSub) {
                minSub = array[i].getNumberOfSubordinates ();
            }
            if (array[i].getNumberOfSubordinates () > maxSub) {
                maxSub = array[i].getNumberOfSubordinates ();
            }

        }
        System.out.println ("Max quantity of subordinates:" + maxSub);
        System.out.println ("Min quantity of subordinates:" + minSub);
    }
    public static void findAddValue(Manager1[] array) {


    }

}
