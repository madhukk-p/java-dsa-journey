import java.util.Scanner;

public class Methods4 {

public static void eligibleForVote(int age){
if(age>=18){
    System.out.println("eligible for vote");
}
else
    {
        System.out.println("not eligible");
    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        eligibleForVote(age);
        sc.close();
    }
}
