//Write a java program to input week number (1-7) and print  day of week name
//using swtich case.
import java.util.*;

public class Q9 {
    
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int ch;
        System.out.print("Enter the case=");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            {
                System.out.print("Monday");
                break;
            }
            case 2:
            {
                System.out.print("Tuesday");
                break;
            }
            case 3:
            {
                System.out.print("Wednesday");
                break;
            }
            case 4:
            {
                System.out.print("Thursday");
                break;
            }
            case 5:
            {
                System.out.print("Friday");
                break;
            }
            case 6:
            {
                System.out.print("saturday");
                break;
            }
            case 7:
            {
                System.out.print("sunday");
                break;
            }
            default :
            {
                System.out.print("Not Found");
            }
            
        }
    }
}
