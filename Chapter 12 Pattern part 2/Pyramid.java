import java.util.*;
public class Pyramid {
      public static void main(String args[]){
        int n;
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the numbers=");
        n=sc.nextInt();
        System.out.print("Pyramid Pattern ::\n");
        for(int i=1; i<=n; i++)
        {
          for(int j=n; j>i; j--)
          {
            System.out.print(" ");
          }
         for(int k=1; k<=i; k++)
          {
            System.out.print("*");
          }
          System.out.print("\n");
        }
    }
}
