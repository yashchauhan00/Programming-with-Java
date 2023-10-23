//write a program print if number Even or odd.
import java.util.*;
public class Q2 {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter the num=");
        n=sc.nextInt();
        if(n%2==0)
        {
            System.out.print("Even");
        }
        else{
            System.out.print("odd");
        }
    }
}
