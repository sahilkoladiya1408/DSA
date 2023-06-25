import java.util.Scanner;

public class InsertionSortPart2 {

    public static void printer(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void insertionSort(int[] arr) {
        int i,j;
        for (i = 0,j=i+1; j < arr.length; i++,j++) {
            int temp = arr[j];
            int a = i;
            while(a >= 0 && temp < arr[a]){
                arr[a + 1] = arr[a];
                a--;
            }
            arr[a + 1] = temp;
            printer(arr);
        }
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
