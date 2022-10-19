package homeWork7;
//Задача №1
//
//Необходимо создать класс Employee со следующими методами:
//getBaseSalary - получить базовую ставку
//set Base Salary
//getName - получить имя
//setName
//getSalary - получить зарплату


public abstract class Employee {
    private String name;
    private int baseSalary = 100;
    private int salary;


    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBaseSalary() {
        return baseSalary;
    }
//
//    public void setBaseSalary(int baseSalary) {
//        this.baseSalary = baseSalary;
//    }


    public int getSalary() {
        return baseSalary;
    }

    @Override
    public String toString() {
        return "Employee: " + " name= " + name + '\'' + " , baseSalary= " + baseSalary ;
    }
}
