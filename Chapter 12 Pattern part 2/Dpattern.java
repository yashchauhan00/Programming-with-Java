import java.util.*;
public class Dpattern {
    public static void main(String args[]){
        int n;
        System.out.print("Enter the number=");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            for(int j=n; j>i; j--)
            {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        for(int i=1; i<=n; i++)
        {
            for(int j=n; j>=i; j--)
            {
                System.out.print("* ");
            }
         System.out.print("\n");
            for(int k=1; k<=i; k++)
            {
                System.out.print(" ");
            }
       
        }
    }
}
