// write a program find of factorial of any number entered by user
import java.util.*;
public class Q9 {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,fact=1;
        System.out.print("Enter the user=");
        n=sc.nextInt();
        for(int i=1; i<=n; i++)
           fact=fact*i;
        System.out.print("factorial="+fact);
    }
}
