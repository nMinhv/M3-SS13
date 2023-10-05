package ra.bt.bt4;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[][] arr = getArr();
        int max = arr[0][0] ;
        Map<Integer,Integer> locates = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    locates.clear();
                    locates.put(i,j);
                    max = arr[i][j];
                }
            }
        }
        for (int[]ints:arr
             ) {
            System.out.println(Arrays.toString(ints));
        }
            System.out.printf("Vi tri xuat hien cua so lon nhat %d la %s",max,locates);
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
