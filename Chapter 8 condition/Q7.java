//Write a program to get a number from the user and print whether it is postive
//or negative
import java.util.*;
public class Q7 {
    
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n;
        System.out.print("Enter any number=");
        n=sc.nextInt();
        if(n>0)
        {
            System.out.print("Postive");
        }
        else
        {
            System.out.print("Negative");
        }
    }
}
