public class Testing {
    public static void main(String[] args) {
        int a =5;
        int b =10;
         System.out.println("The value of a is " +a+  ". The value of b is " +b);

        /***  a = a+b;
         b =a-b;
         a = a-b; 
          System.out.println("The value of a is " +a+  ". The value of b is " +b);
*/
         a = a^b;
         b =a^b;
         a = a^b;
         System.out.println("The value of a is " +a+  ". The value of b is " +b);

         
    }
}
