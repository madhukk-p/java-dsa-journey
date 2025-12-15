import java.util.Scanner;

public class seperateCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers? ");
        int n = sc.nextInt();
        int numZeros = 0;
        int numPos = 0;
        int numNeg = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter " + i + " number: ");
            int num = sc.nextInt();
            if (num > 0) {
                numPos++;
            } else if (num == 0) {
                numZeros++;
            } else {
                numNeg++;
            }
            System.out.println();
        }
        System.out.println("You entered " + numPos + " Positive values, "+ numNeg+ " Negative values and "+ numZeros+ " Zeros");
    }
}
