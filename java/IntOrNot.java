
/***Program to detect whether a number
  entered by user is integer or not? ***/

import java.util.Scanner;

public class IntOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();


        if (num ==(int)num) {  //important to note
            
            System.out.println("Is Integer");
           
        } else {
            System.out.println("Not Integer");
        }

        sc.close();
    }
}
