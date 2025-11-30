import java.util.Scanner;

public class PracticeFactorial {
	

	
	
		public static long fact(int n) {
	
			long fact = 1;
	
			for (int i = 1; i <= n; i++) {
				fact = fact * i;
			}
	
			return fact;
		}
	
		public static void main(String[] args) {
	
			Scanner sc = new Scanner(System.in);
	
			int n = sc.nextInt();
	
			long result = fact(n);
			System.out.println(result);
			sc.close();
	
		}
	}

	
