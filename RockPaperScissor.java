import java.util.*;

class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int cpuInput = random.nextInt(3)+1;
         System.out.println("Enter 1 for rock, 2 for Paper,3 for Scissor");
        int userInput = sc.nextInt();
        
        if(userInput ==1){
            if (cpuInput ==1)
                {System.out.println("Both are Rock-Game Draw");}
            else if(cpuInput ==2){
                System.out.println("Yours is Rock and cpu was paper. You lost.");
            }
            else {
                System.out.println("Yours is Rock and cpu was scissor. You win.");
        }
    }
        if(userInput ==2){
            if (cpuInput ==1)
                {System.out.println("Your is paper and cpu was Rock. You win");}
            else if(cpuInput ==2){
                System.out.println("Yours is paper and cpu was paper. Draw.");
            }
            else {
                System.out.println("Yours is paper and cpu was scissor. You lost.");
        }
    }
        if(userInput ==3){
            if (cpuInput ==1)
                {System.out.println("Your is Scissor and cpu was Rock. You lost");}
            else if(cpuInput ==2){
                System.out.println("Yours is Scissor and cpu was paper. you win.");
            }
            else {
                System.out.println("Yours is Scissor and cpu was scissor. Draw.");
        }
    }
        sc.close();
    
    }
}

