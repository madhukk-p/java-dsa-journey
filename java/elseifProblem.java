
import java.util.Scanner;

public class elseifProblem {
   
 
    public static void main(String[] args) {
        // write your code logic here !! 

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age >=0 && age<=4){
            System.out.print("Infants");
        }else if(age>=5 && age<=12){
            System.out.print("Children");
        }else if(age>=13 && age<=64){
            System.out.print("Adults");
        }else if(age>=65 ){
            System.out.print("Seniors"); 
    }
    sc.close();
}
    }

