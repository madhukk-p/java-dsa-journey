
/*  Write a java program to encrypt a grade by adding 8 to it.
    Decrypt it to show the correct grade.  */

public class Operators1 {
    public static void main(String[] args) {

        char grade = 'A';
        grade = 'A' + 8; // encrypt

        System.out.println(grade);

        grade = (char) (grade - 8); // Decrypt
        System.out.println(grade);

    }
}