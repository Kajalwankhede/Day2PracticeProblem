//1. Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5 using For Loop.
package Day2Program;

import java.util.Scanner;

public class SumOfNoForloop {
    public static void main(String[] args) {
        int n, sum =0;
        System.out.printf("Enter the Natural Number :"+"\n");
        try(Scanner sc=new Scanner(System.in)){
            n=sc.nextInt();

        }
        for(int i=0; i<= n; i++)
        {
            sum= sum + i;
        }
        System.out.printf("Sum of First Natural Numbers:"+n+" is "+sum);
    }
}
