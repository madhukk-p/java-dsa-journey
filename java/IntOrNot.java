
/***Program to detect whether a number
  entered by user is integer or not? ***/

import java.util.Scanner;

public class IntOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextLine()) {  //important to note
            int num = sc.nextInt();
            System.out.println("Is Integer");
            System.out.println(num);
        } else {
            System.out.println("Not Integer");
        }

        sc.close();
    }
}
