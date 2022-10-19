package hwPersonEmployee;

public class EmployeeUtils {
    public static void findName(Employee[] arr, String employeeName) {
        for (Employee employee: arr) {
            if(employeeName.equals (employee.getName ())) {
                System.out.println (employee.toString ());
            }
        }

    }
    public static void findName1(Employee[] arr, String str) {
        for (Employee employee: arr) {
            if(employee.getName ().contains (str)) {
                System.out.println (employee.toString ());
            }
        }

    }
    public static void getMinSalary (Employee[] array) {
        Employee min = array[0];
        for (Employee employee: array) {
            if (min.getSalary () > employee.getSalary ()) {
                min = employee;
            }
        }
        System.out.println ("Min salary : " + min.toString ());
    }
    public static void getMaxSalary (Employee[] array) {
        Employee max = array[0];
        for (Employee employee: array) {
            if(max.getSalary () < employee.getSalary ()) {
                max =employee;
            }
        }
        System.out.println ("Max salaru : " + max.toString ());
    }


}
