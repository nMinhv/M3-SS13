package ra.bt.bt3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = getArr();
        int search = scanner.nextInt();
        boolean find = false;
        Map<Integer,Integer> locates = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == search) {
                    locates.put(i,j);
                    find = true;
                }
            }
        }
        if(find){
        System.out.printf("Vi tri xuat hien cua %d la %s",search, locates);
        }else {
            System.out.println("Not found");
        }
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
