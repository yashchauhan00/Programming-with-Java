//Write a program print square pattern.
import java.util.*;
public class Q4 {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter the num=");
        n=sc.nextInt();
        for( int i=1; i<=n; i++)
        {
            for(int j=0; j<=n; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
