import java.util.Scanner;

public class InsertionSortPart1 {

    public static void printer(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void insertionSort(int[] arr) {
        int temp;
        for (int i = arr.length - 1; i > 0; i--) {
            temp = arr[i];

            if (arr[i - 1] > temp) {
                arr[i] = arr[i - 1];
                printer(arr);
                arr[i - 1] = temp;
            }
        }

        printer(arr);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        insertionSort(arr);
    }
}
