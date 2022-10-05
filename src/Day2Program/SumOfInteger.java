//Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5 by while loop

package Day2Program;
import java.util.Scanner;
public class SumOfInteger {
    public static void main(String args[])
    {
       int n, i=0, sum=0;
        System.out.println("Enter the natural numbers: "+"\n");

           try (Scanner sc=new Scanner(System.in)){
           n = sc.nextInt();
           }
        while (i < n)
        {
            i++;
            sum =sum+i;

    }
        System.out.println("Sum of First "+n+" Natural Numbers is : " +sum);
}
}