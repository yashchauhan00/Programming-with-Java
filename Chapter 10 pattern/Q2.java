//write a program print inverted star pattern.
import java.util.*;
public class Q2 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.print("Enter the num=");
        n=sc.nextInt();
        for(int i=n; i>=1; i--)
        {
            for(int j=i; j>=1; j--)
            {
                System.out.print("*");
            }
           System.out.println();
        }
        
    }
    
}
