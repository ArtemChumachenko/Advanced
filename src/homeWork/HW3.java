package homeWork;

import java.util.Arrays;

public class HW3 {

    //                   Making Task counter
    static void taskCounter(int count1) {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_YELLOW = "\033[1;93m";
        if (count1 < 8) {
            System.out.println(ANSI_RED + "Task " + (count1) + ANSI_RESET);
            System.out.println(ANSI_RED + "======" + ANSI_RESET);
        } else {
            System.out.println(ANSI_YELLOW + "Extra Task " + (count1) + ANSI_RESET);
            System.out.println(ANSI_YELLOW + "==========" + ANSI_RESET);
        }
    }
//     Task #7
    public static int count (int[][] arrays) {
        int result = 0;
        for (int i = 0; i < arrays.length; i++) {
            int[] m = arrays[i];
            result = result + m.length;
        }
        return result;
    }

    public static void circle () {
        int r = 15;
        for (int y = 0; y <= (r * 2); y = y + 3) {
            for( int x =0; x <= (r * 2); x++){
                if ((x-r) * (x-r) + (y - r) * (y - r) <= r * r ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

        }

    public static void main(String[] args) {
// Task 1-3
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            sum += array[i];                   // sum of all values
            if (max < array[i]) {                   // max value
                max = array[i];
            }
            if (min > array[i]) {                   // min value
                min = array[i];
            }

        }

        taskCounter(1);
        System.out.println("Sum of all  values of array " + Arrays.toString(array) + " = "+ sum);
        taskCounter(2);
        System.out.println("Max value of array " + Arrays.toString(array) + " = "  + max);
        taskCounter(3);
        System.out.println("Min value of array " + Arrays.toString(array) + " = "  + min);

// Task 4
        for (int i = 0; i < 9; i++ ) {                // create array
            array[i] = i + 1;
        }
        sum = 0;
        int  avg = 0;
        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            avg = sum / array.length;
        }
        taskCounter(4);
        System.out.println("Avg of all values of array " + Arrays.toString(array) + " = " + avg);
//  Task 5 - 7
        int[][] arrays = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        sum = 0;
        max = arrays[0][0];

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                sum += arrays[i][j];
                if (max < arrays[i][j]) {
                    max = arrays[i][j];
                }

            }
        }

        taskCounter(5);
        System.out.println("Sum of all  values of array {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}}" +
                " = "+ sum);
        taskCounter(6);
        System.out.println("Max value of array {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}} = "  + max);
        taskCounter(7);
        System.out.println("Count of elements of array {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}}" +
                " = " + count(arrays));
        taskCounter(8);
        circle();





    }
}
