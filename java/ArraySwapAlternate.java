import java.util.Scanner;

public class ArraySwapAlternate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value of element " + i + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Input array is : ");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        for (int i = 0; i < n-1; i+=2) {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        System.out.print("Array after Swapping is : ");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }
        sc.close();
    }
}