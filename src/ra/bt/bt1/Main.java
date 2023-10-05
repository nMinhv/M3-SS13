package ra.bt.bt1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] arr = getArr();
        int max = getArr()[0][0];
        for (int[] ints : arr) {
            for (int j = 0; j < arr.length; j++) {
                if (ints[j] > max) {
                    max = ints[j];
                }
            }
            System.out.println(Arrays.toString(ints));
        }

        System.out.println(max);
    }

    private static int[][] getArr() {
        int arr[][] = new int[20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }

        }
        return arr;
    }
}