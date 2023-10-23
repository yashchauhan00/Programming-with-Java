//write a program print the largest of 2 number
import java.util.*;
public class Q1 {
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
          int a,b;
         System.out.print("Enter the num=");
         a=sc.nextInt();
         b=sc.nextInt();
         if(a>b)
         {
            System.out.print("larget="+a);
         }
         else{
            System.out.print("largest="+b);
         }
    }
    
}
