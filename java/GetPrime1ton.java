import java.util.Scanner;

public class GetPrime1ton {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int t = 2; t <= n; t++) {
            Boolean Isprime = true;
            for (int i = 2; i <= t / 2; i++) {
                if (t % i == 0) {
                    Isprime = false;
                    break;
                }
            }
            if (Isprime)
                System.out.println(t);
        }
        sc.close();
    }

}
