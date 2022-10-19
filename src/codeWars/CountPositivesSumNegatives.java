package codeWars;

import java.util.Arrays;



public class CountPositivesSumNegatives {
    public static int[] countPositivesSumNegatives(int[] input) {
        int[] output = new int[2];

        if (input != null && input.length != 0) {

            int count = 0;
            int sum = 0;
            for (int i = 0; i < input.length; i++) {
                if (input[i] > 0) {
                    count++;
                } else {
                    sum += input[i];
                }
            }
            output = new int[]{count, sum};
            System.out.println (Arrays.toString (output));


        }
        return output;
    }

        public static void main (String[]args){
            int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};

            countPositivesSumNegatives (array);

        }


}

