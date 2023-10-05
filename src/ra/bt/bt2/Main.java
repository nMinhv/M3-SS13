package ra.bt.bt2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] arr = getArr();
        int min = arr[0][0];
        for (int[] ints : arr) {
            for (int j = 0; j < arr.length; j++) {
                if (ints[j] < min) {
                    min = ints[j];
                }
            }
            System.out.println(Arrays.toString(ints));
        }
        System.out.println(min);
    }

    private static int[][] getArr() {
        int[][] arr = new int[20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100) + 1;
            }

        }
        return arr;
    }
}
