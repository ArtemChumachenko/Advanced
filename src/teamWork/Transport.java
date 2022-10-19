package teamWork;

abstract class Transport implements INumbersOfPassangers{
    private int wheels;
    private int seat;

    public Transport(int wheels, int seat, int numbersOfPassangers) {
        this.wheels = wheels;
        this.seat = seat;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }
    public abstract void move();
}
