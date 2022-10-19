package homeWork7;

public class MainHW7 {
    public static void main(String[] args) {

        Worker john = new Worker ("John");
        System.out.println (john.getSalary ());
        Worker nick = new Worker ("Nick");
        Manager bob = new Manager ("Bob",150);
        Director jim = new Director ("Jim",  1000);
        System.out.println (bob.getSalary ());
        System.out.println (bob.toString ());
        System.out.println (jim.toString ());
        System.out.println (nick.toString ());



      }
}
