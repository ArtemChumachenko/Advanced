package hwPersonEmployee;

import static hwPersonEmployee.EmployeeUtils.*;
import static hwPersonEmployee.SalaryUtils.getSum;

public class Main {
    public static void main(String[] args) {
        Employee jim = new Employee ("Jim", 'M', 1980, 120000);
        Employee gill = new Employee ("Gill", 'F', 1988, 100000);
        Employee bill = new Employee ("Bill", 'M', 1990, 110000);
        Employee[] employeeArray = {jim, gill,bill};

        System.out.println (gill.getName ());
        System.out.println (gill.isSameName (jim));
        getSum(employeeArray);
        findName(employeeArray, "Mr. Bill");
        findName1 (employeeArray,"ill");
        getMinSalary(employeeArray);
        getMaxSalary (employeeArray);

    }
}

