
    import java.util.Scanner;
    public class Permutation{
        public static long permutation(int n, int r) {
        if(n<r || n<0 || r<0){
            System.out.println("Invalid Input");
            return -1;
        }

        long result = fact(n)/fact(n-r);
        return result;
        }
    
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
                int r = sc.nextInt();
    
               long ans =permutation(n,r);
               System.out.println(ans);
               sc.close();
            }
    }


    
    /****public static long permutation(int n, int r) {
    if(n < r || n < 0 || r < 0) {
        System.out.println("Invalid Input");
        return -1;
    }

    long res = 1;
    for(int i = 0; i < r; i++){
        res *= (n - i);
    }
    return res;
}
 */