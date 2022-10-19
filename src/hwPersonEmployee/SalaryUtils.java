package hwPersonEmployee;

public class SalaryUtils {
    public static int getSum(Employee[] employeeArray) {
        int sum = 0;
        if (employeeArray == null) {
            return 0;
        }
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].getSalary () != 0) {
                sum += employeeArray[i].getSalary ();
            } else {
                System.out.println ("Employee " + employeeArray[i].getName () + " does not have salary");
            }
        }
        System.out.println ("Total salary :" + sum);
        return sum;
    }
}


