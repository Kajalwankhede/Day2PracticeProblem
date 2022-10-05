package Day2Program;
import java.util.Scanner;
public class Readnumber2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter a Number:");
        a = sc.nextInt();

        if (a == 1) {
            System.out.println("Unit");
        } else if (a == 10) {
            System.out.println("Ten");
        } else if (a == 100) {
            System.out.println("Hundred");
        } else if (a == 1000) {
            System.out.println("Thousand");
        } else if (a == 10000) {
            System.out.println("Ten Thousand");
        } else if (a == 100000) {
            System.out.println("One lakh");
        }
        else{
            System.out.println("Invalid Number.");
        }
    }
}