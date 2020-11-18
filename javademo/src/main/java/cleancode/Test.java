package cleancode;

import java.util.Arrays;
import java.util.Random;

public class Test {
    public static int [] EMPTY_ARRAY = new int[0];
    public static void main(String[] args) {
        int [] arr = genArr(6);
        System.out.println(Arrays.toString(arr));
        sort(arr);
    }

    private static void sort(int[] arr) {
        int arrLength = arr.length;
        for (int i = 0; i < arrLength-1; i++ ) {
            for (int j =0; j< arrLength-1-i; j++) {
                if (arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static int[] genArr(int len) {
        if (len < 0) {
            System.out.println("长度必须大于0");
            return  EMPTY_ARRAY;
        }
        else {
            int [] arr = new  int [len];
            for (int i = 0; i < len; i++) {
                arr[i]  = new Random().nextInt(10);
            }
            return arr;
        }

    }

}
