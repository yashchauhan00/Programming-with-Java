// Write a program print the largest of 3 number.
import java.util.*;
   public class Q4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter the three num=");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b && a>c)
        {
            System.out.print("largest="+a);
        }
        else if(b>c){
            System.out.print("largest="+b);
        }
        else{
            System.out.print("largest=",+c);
        }
    }
}