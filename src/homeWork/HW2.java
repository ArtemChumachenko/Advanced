package homeWork;

public class HW2 {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        int sum1 = 0;
        int sum2 = 0;

        for( int i =0; i < arr1.length; i ++) {
            sum1 = sum1 + arr1[i];
        }
        for( int i =0; i < arr2.length; i ++) {
            sum2 = sum2 + arr2[i];
        }
        int sum = sum1 + sum2;
        System.out.println (sum);


    }
}
