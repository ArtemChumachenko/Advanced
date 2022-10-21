package codeWars;

public class MinMax {
    public static int[] minMax(int[] arr) {
        // Your awesome code here
        int[] arr1 = new int[2];
        if (arr != null && arr.length != 0) {
            int min = arr[0];
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] < min) {
                    min = arr[i];
                }
                if(arr[i] > max) {
                    max = arr[i];
                }
                arr1[0] = min;
                arr1[1] = max;
            }

        } else {
           arr1 = new int[0];
        }
        return arr1;
    }
}
