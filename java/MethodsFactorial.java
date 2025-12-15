
    
    import java.util.Scanner;
    public class MethodsFactorial {
	
	public static int fact(int n) {
		// Write your code here
		int factorial =1;
      for(int i=1; i<=n;i++){
		  factorial =factorial*i; 
	  }
	  return factorial;
	}	

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		System.out.println(fact(n));

sc.close();
	}

}

