package homeWork7;

public class MainHW7 {
    public static void main(String[] args) {

        IEmployee john = new Manager ("John", 25, 'M', 10000,10);
        IEmployee mike = new Worker ("Mike", 28, 'M', 1500);
        IEmployee kate = new Director ("Kate", 35,'F', 10000,500);

        IManager luck = new Manager ("Luck", 27, 'M', 2300, 25);
        IManager nick = new Director ("Nick", 34,'M', 3500, 200 );






      }
}
