package homeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class HW4 {

    static void checkArray() {
        Scanner scanner = new Scanner(System.in);
        int n = 5;
        String[] song = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the "+ (i+1) + " word of the song");
            song[i] = scanner.next() + " ";

            song[i] = song[i].toLowerCase();
        }
        System.out.println("Song you entered ");
        for(String s:song) {
            System.out.print(s);
        }
        Arrays.sort(song);
        System.out.println("Sorted in alphabetical order :" + Arrays.toString(song));




    }
    static void countLetters() throws IOException {
        String song;
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the Statement:");
        song=bufferedReader.readLine();
        int count=0,len=0;
        do
        {
            try
            {
                char[] name =song.toCharArray();
                len=name.length;
                count=0;
                for(int j = 0;j < len; j++)
                {
                    if((name[0] == name[j]) && ((name[0] >= 65 && name[0] <=91 ) || (name[0] >= 97 && name[0] <= 123)))
                        count++;
                }
                if(count!=0)
                    System.out.println(name[0]+" "+count+" Times");
                song=song.replace(""+name[0],"");
            }
            catch(Exception ex) {
                throw new RuntimeException (ex);
            }
        }
        while(len!=1);
    }
    static void makeTriangleOne( ) {
       for(int i = 10; i > 0; i-- ) {
           for (int j = 0; j < i; j++ ){
               System.out.print (j + " ");
           }
           System.out.println ();
       }

    }

    static void makeTriangleTwo() {
//        for (int i = 0; i < 10; ++i) {
//            for(int j = 0; j < i; ++j ) {
//                System.out.print("  ");
//            }
//             for(int y = 0 ; y <= 10 - i-1; ++y) {
//                System.out.print(y +" ");
//            }
//            System.out.println();
//
//        }
        for (int i = 0; i < 10; i ++) {
            for(int j = 0; j< i; j ++) {
                System.out.print ( "  ");
            }
            for (int y = 0; y <= 10-i ; y++) {
                System.out.print (y + " ");
            }
            System.out.println ();
        }

    }
    static void makeTriangleThree() {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
                }
            for (int k = 9 - i; k >= 0; k--) {
                System.out.print(k + " ");
            }
            for (int x = 1; x <10- i ; x++) {
                 System.out.print(x + " ");
            }

                System.out.println();
            }
        }

        static void makePir() {
        String s = "9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8 9";
            System.out.println (s);
            for(int i = 0; i < s.length (); i = i + 2) {
                char a = s.charAt (i);
                System.out.println (s = s.replace (a, ' '));
            }

        }


    public static void main(String[] args) throws IOException {
//        checkArray();
  //      countLetters();
//        makeTriangleOne();
//        System.out.println();
        makeTriangleTwo();
//        System.out.println();
//        makeTriangleThree();
//        System.out.println ();
//        makePir ();



    }
}
