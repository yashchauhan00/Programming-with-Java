import java.util.*;
public class Hollowp {
    public static void main(String args[]){
        int Row,Col;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the ROW=");
         Row=sc.nextInt();
        System.out.print("Enter the COL=");
         Col=sc.nextInt();
         for(int i=1; i<=Row; i++)
         {
            for(int j=1; j<=Col; j++)
            {
                if(i==1 || i==Row || j==1 || j==Col)
                {
                    System.out.print("*");  
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
            