//Write a program to print half pyramid patterm.
import java.util.*;
public class Q3 {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter the num=");
        n=sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
