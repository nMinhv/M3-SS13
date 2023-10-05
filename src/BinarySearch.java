import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    static int[] arr = {1,3,5,2,4,6,8,9,7};

    public static void main(String[] args) {
        Arrays.sort(arr);
        Scanner scanner = new Scanner(System.in);
        while (true){
        System.out.println("Nhap so tim kiem");
        int search = scanner.nextInt();
        binarySearch(search);
        }
    }
    private static void binarySearch(int search) {
        int low = 0;
        int high = arr.length - 1;
        int mid;
        while (high >= low) {
            mid = (high + low) / 2;
            if (search == arr[mid]) {
                System.out.println("Phan tu co ton tai trong mang o vi tri " + mid );
                return;
            } else if (search < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println("Not found");
    }
}
