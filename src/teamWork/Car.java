package teamWork;

public class Car extends Auto {

    private String type;
    private String color;


    public Car(int wheels, int seat, int numbersOfPassangers, String make, String model, int year, String type, String color) {
        super (wheels, seat, numbersOfPassangers, make, model, year);
        this.type = type;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "make='" + getMake () + '\'' +
                ", model='" + getModel () + '\'' +
                ", year=" + getYear () +
                 "type='" + type + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}