package teamWork;

import java.util.Arrays;

import static teamWork.Utilities.*;

public class Main {
    public static void teamWork() {
        Auto toyota = new Auto (4,5,5,"Toyota", "Rav4", 2022);
        Car bmv = new Car (4,7,7,"BMW", "X5", 2020, "SUV", "white");
        Car mercedes = new Car(4,2,2,"Mersedes", "s600", 2016, "sedan", "black");
        Car ford = new Car(4,5,5,"Ford", "Explorer", 2018, "SUV", "red");
        Car nissan = new Car(4,4,4,"Nissan", "Almera", 2019, "sedan", "black");
        Airplain boeng = new Airplain (8, 300,290);

        Transport[] array = {toyota,bmv,mercedes,ford,nissan, boeng};
//        findByColor(array, "black");
//        findOldestCar (array);


    }

    public static void main(String[] args) {
        teamWork ();
    }


}
