//Write a program print 1 to n.
import java.util.*;
public class Q2 {

    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int n;
        System.out.print("Enter the n num=");
        n=sc.nextInt();
        System.out.println(" 1 to 10 num :");
        for(int i=1; i<=n; i++)
        {
            System.out.println(i);
        }
    }

}
