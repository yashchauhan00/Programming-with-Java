import java.util.*;
public class Rtriangle{
    public static void main(String main[])
    {
      int n;
      System.out.print("Enter the number=");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      for(int i=1; i<=n; i++)
      {
        for(int k=1; k<=i; k++)
        {
            System.out.print("*");
        }
        for(int j=n; j>i; j--)
        {
            System.out.print(" ");
        }
        System.out.print("\n");
      }



    }
    
}