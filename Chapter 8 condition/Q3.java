//Write a program  Income tax calaulater.
import java.util.*;
public class Q3 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int tax,income;
        System.out.print("Enter the income=");
        income=sc.nextInt();
        if(income<500000)
        {
            tax=0;
        }
        else if(income<=500000 && income<1000000)
        {
            tax=(int) (income*0.2);
        }
        else{
            tax=(int) (income*0.3);
        }
        System.out.print("you tax is="+tax);
    }
}
