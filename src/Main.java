import java.util.Scanner;

public class Main {
    static int[] arr = new int[10];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        while (true){
        System.out.println("Nhap so tim kiem");
        int search = scanner.nextInt();
         linearSearch(search);
        }
    }

    private static void linearSearch(int search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                System.out.println("Phan tu can tim nam o vi tri " + i);
                return;
            }
        }
        System.out.println("not found");
    }
}
