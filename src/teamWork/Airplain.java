package teamWork;

public class Airplain extends Transport implements INumbersOfPassangers{
    public Airplain(int wheels, int seat, int numbersOfPassangers) {
        super (wheels, seat, numbersOfPassangers);
    }

    @Override
    public void move() {
        System.out.println ("I'm flying");
    }

    @Override
    public int numbersOfPassangers() {
        return 300;
    }
}
