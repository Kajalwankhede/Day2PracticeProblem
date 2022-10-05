package Day2Program;

import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        int n,a,rev = 0;
        System.out.printf("Enter the Number:\n");
        try(Scanner sc = new Scanner(System.in)){
            n= sc.nextInt();

        }
        a = n;
        while (n != 0)
        {
            int rem =n%10;
            rev = (rev*10)+rem;
            n = n/10;
        }
        System.out.printf("Reverse Number: "+a+" is "+rev);
    }
}
