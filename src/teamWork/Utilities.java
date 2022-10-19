package teamWork;

public class Utilities {

    public static void findByColor(Car[] cars, String color) {
        for(int i = 0; i < cars.length; i++) {
            if ( color.equals (cars[i].getColor ())) {
                System.out.println (cars[i].getMake () + " " + cars[i].getModel ());
            }
        }

    }
    public static void findOldestCar(Car[] cars) {
        Car min = cars[0];
          for(Car car : cars ) {
            if (min.getYear () > car.getYear ()) {
                min = car;
            }
        }
        System.out.println (min.toString ());

    }

}
