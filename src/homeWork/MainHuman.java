package homeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static homeWork.Human.printCountry;


//import static homeWork.Human.compareTo;

public class MainHuman {

    public static void main(String[] args) {
        //
//        Human john = new Human ("John", 'M', 1982, "USA", 50000, "Master");
//        Human gill = new Human ("Gill", 'F', 1990, "CANADA", 47000, "Bachelor");
//        Human bill = new Human ("Bill", 'M', 1980, "USA", 88000, "PhD");
//        Human alex = new Human ("Alex", 'M', 1995, "GERMANY", 79000, "Master");
//        Human anna = new Human ("Anna", 'F', 2000, "AUSTRIA", 65000, "Bachelor");
//        Human kate = new Human ("Kate", 'F', 1995, "CANADA", 65000, "Master");
//        Human alis = new Human ("Alis", 'F', 1993, "JAPAN", 87000, "PhD");
//        Human andrew = new Human ("Andrew", 'M', 1989, "USA", 65000, "Master");

       Human[] array = {
                 new Human ("John", 'M', 1982, "USA", 50000, "Master")
               , new Human ("Gill", 'F', 1990, "CANADA", 47000, "Bachelor")
               , new Human ("Bill", 'M', 1980, "USA", 88000, "PhD")
               , new Human ("Alex", 'M', 1995, "GERMANY", 79000, "Master")
               , new Human ("Anna", 'F', 2000, "AUSTRIA", 65000, "Bachelor")
               , new Human ("Kate", 'F', 1995, "CANADA", 65000, "Master")
               , new Human ("Alis", 'F', 1993, "JAPAN", 87000, "PhD")
               , new Human ("Andrew", 'M', 1989, "USA", 65000, "Master")
       } ;


       Human.printCountry (array, "USA");
       Human.printDegree (array, "Master");





        }
    }


