import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("Input should be odd");

        }

        else {
            int mid = n / 2 + 1;

            for (int i = 1; i <= mid; i++) {

                for (int k = mid; k > i; k--) {
                    System.out.print(" ");
                }

                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");

                }
                System.out.println();

            }
            for (int i = mid - 1; i >= 1; i--) {

                for (int j = mid - 1; j >= i; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        sc.close();

    }
}