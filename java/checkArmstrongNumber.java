import java.util.Scanner;;

public class checkArmstrongNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int inputNum = n;

        int temp = 0;

        while(n>0){
            int lastDigit = n%10;
            temp += Math.pow(lastDigit, 3);
            n = n / 10;
        }
        
        if(inputNum == temp)
            System.err.println("Its an Armstrong number");
        


        sc.close();
    }
    
}
