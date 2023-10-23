//Write a program print revers of a number.
import java.util.*;
public class Q5 {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter the num=");
        n=sc.nextInt();
        while(n>0)
        {
        int last=n%10;
            System.out.print(last);
            n=n/10;
        }
    }
    
}
