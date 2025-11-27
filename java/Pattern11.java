import java.util.Scanner;


public class Pattern11 {
    


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		int n = sc.nextInt();

		for(int i =1; i<=n; i++){

			for(int j =i; j>0;j--){
				System.out.print(j);
			}System.out.println();
		}

		
	
       sc.close();
}
}

