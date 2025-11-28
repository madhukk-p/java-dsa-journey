//import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
     //   int n = sc.nextInt();

        //char limit = 'a' +  n;
        for(char ch = 'A';ch<='H' ;ch++ ){
            for(char i = 'A'; i<=ch; i++){
                System.out.print(i);
            }System.out.println();
        }
    }
}
