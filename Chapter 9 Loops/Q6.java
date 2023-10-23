//Write a program if a number is prime or not.
import java.util.*;
public class Q6 {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,count=0,i;
        System.out.print("Enter the num=");
        n=sc.nextInt();
        for(i=1; i<=n; i++)
        {
            if(n % i==0)
            {
               count++;
            }
        }
        if(count==2)
        {
            System.out.print("prime num");
        }
        else{
            System.out.print("not prime num");
        }
    }
}
