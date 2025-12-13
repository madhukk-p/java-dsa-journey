import java.util.Scanner;

public class IdentifyTriangle {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();

if(a< (b+c) && b< (a+c) && c< (a+b)){

    if(a == b && b == c && c == a){
        System.out.println("Equilateral Triangle");
    }else if(a==b || b==c || c==a ){
        System.out.println("Isosceles Triangle");
    }else{
        System.out.println("Scalene Triangle");
    }
}else{
    System.out.println("Not a Triangle");}

sc.close();
}
}