import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
       int a =0;
       int b =1;

       if(n>0){
        System.out.println(a);
        n--;
       }
      if(n>0){
        System.out.println(b);
        n--;
      }
       
        while(n>0){
            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            n--;
        }
        sc.close();
    }
}
