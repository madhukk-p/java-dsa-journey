import java.util.Scanner;
public class SimpleInterestMethods {
public static int calculateSimpleInterest(int principal, double rate, int time)  {
double si = (principal* rate* time) / 100.0;
return (int) si;

}  

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  
    int principal = sc.nextInt();
    double rate = sc.nextDouble();
    int time = sc.nextInt();

    int simpleInterest = calculateSimpleInterest(principal, rate, time);

    System.out.println(simpleInterest);

    sc.close();
}


}
