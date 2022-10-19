package lessons;

import humans.Employee;
import humans.Person;
import humans.Tweet;

public class Lesson05 {
    public static void main(String[] args) {
        Person p = new Person ("Jane", 'F', 1980);
        p.setFather ("Jake", 'M', 66);

        Person jane = new Person ("Jane", 'F', 1987);
        Person jake = new Person ("Jake", 'M', 1983);
        Person jp = new Person ("JP");

        Person[] arr = {jane, jake, jp};


        Employee john = new Employee ("John", 'M', 1980, 120000);


        john.printName ();
        jane.printName ();
        jane.setMother ("Mary", 'F', 75);
        jane.setFather ("Jake", 'M', 66);

//
        System.out.println (String.format ("name: %s, sex: %s, age: %d mother: %s, father: %s", jane.getName (), jane.getSex (), jane.getAge (), jane.getMother ().getName (), jane.getFather ().getName ()));

    }
}