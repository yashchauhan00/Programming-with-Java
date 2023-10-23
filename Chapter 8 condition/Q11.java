// Write a java program that takes a year from the user and print whether
// that year is a leap year or not.
import java.util.*;
public class Q11 {
    
    public static void main(String args[]){
        int year;
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the year=");
        year=sc.nextInt();
        if(year%4==0)
        {
            System.out.print("leap year");
        }
        else{
            System.out.print("Not leap year");
        }
    }
}
