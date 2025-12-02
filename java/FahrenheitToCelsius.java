import java.util.Scanner;

public class FahrenheitToCelsius {

    public static int fahrenheitToCelsius(int f) {
        return (int) ((f - 32) * 5.0 / 9);
    }

    public static void printFahrenheitTable(int S, int E, int W) {
        for (int f = S; f <= E; f += W) {
            int c = fahrenheitToCelsius(f);
            System.out.println(f + " " + c);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int S= sc.nextInt();
        int E= sc.nextInt();
        int W= sc.nextInt();

        printFahrenheitTable(S, E, W);
        sc.close();
        
    }

}
