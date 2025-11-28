import java.util.Scanner;

public class Pattern19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
int num;
		for(int i =1; i<=n;i++){

			for(int j = 1; j<=n-i;j++){
				System.out.print(" ");
			}
			num=i;
		for(int j = 1; j <= 2*i-1; j++) {
System.out.print(num);
if(j < i) num++;
else num--;
}
		System.out.println();
		}
		sc.close();
	}
}
