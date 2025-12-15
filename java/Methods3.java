import java.util.Scanner;

public class Methods3 {
    
    
    public static double circumferenceOfCircle(double r){
        
      return 2* Math.PI *r;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.println(circumferenceOfCircle(r));
        sc.close();
    }
    
}
