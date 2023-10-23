//write a program to made calculater.
import java.util.*;
public class Q6 {
    
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         int a,b;
         char operator;
         System.out.print("Enter the a=");
         a=sc.nextInt();
         System.out.print("Enter the b=");
         b=sc.nextInt();
         System.out.print("Ente the opertor=");
         operator= sc.next().charAt+(0);
         switch(operator)
         {
            case '+':
            {
               System.out.print(a+b);
               break; 
            }
            case '-':
            {
               System.out.print(a-b);
               break; 
            }
            case '*':
            {
               System.out.print(a*b);
               break; 
            }
            case '/':
            {
               System.out.print(a/b);
               break; 
            }
            case '%':
            {
               System.out.print(a%b);
               break; 
            }
            default :
            {
                System.out.print("wrong operator");
            }
         }

    }
}
