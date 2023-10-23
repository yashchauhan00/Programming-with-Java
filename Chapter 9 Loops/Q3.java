// Write a program sum of first N natural numbers.
import java.util.*;
public class Q3 {
    
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
         int n,sum=0;
         System.out.print("Enter the num=");
         n=sc.nextInt();
         for( int i=1; i<=n; i++)
         {
                sum +=i;
         }
         System.out.print("sum of first nat num="+sum);
    }
}
