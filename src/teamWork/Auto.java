package teamWork;

public class Auto extends Transport implements INumbersOfPassangers{
    private String make;
    private String model;
    private int year;


    public Auto(int wheels, int seat, int numbersOfPassangers, String make, String model, int year) {
        super (wheels, seat, numbersOfPassangers);
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
    @Override
    public void move() {
        System.out.println ("I am driving");
    }

    @Override
    public int numbersOfPassangers() {
        return 5;
    }
}




