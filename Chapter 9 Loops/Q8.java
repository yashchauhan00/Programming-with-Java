//Write a program that reads a set of itntegars and then prints the sum of the even
//and odd integars.
import java.util.*;
public class Q8 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,sum=0;
        System.out.print("Enter the num=");
        n=sc.nextInt();
        for(int i=1; i<=n; i++)
         {
             if(i%2==0)
            {
                sum=sum+n;
            }
            else
            {
                sum=sum+n;
            }
         }
             System.out.print("Even"+sum);
            System.out.print("odd"+sum);
        }
}
