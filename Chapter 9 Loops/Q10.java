//write a program to print  the mutiplication tabel of a number N enterd by user.
import java.util.*;
public class Q10 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter the number=");
        n=sc.nextInt();
        for(int i=1; i<=10; i++)
        {
            System.out.println(n+"*"+i+"="+n*i);
        }

        
    }
}
