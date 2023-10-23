//Finish the following code so that it prints you have a fever if your temper
//s above 100 and otherwise peints you don't have a fever
import java.util.*;
public class Q8 {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int n;
        System.out.print("Entr the temp=");
        n=sc.nextInt();
        if(n>100)
        {
            System.out.print("Fever");
        }
        else
        {
            System.out.print("Not Fever");
        }

    }
}
