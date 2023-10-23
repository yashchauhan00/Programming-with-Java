//write a program using function find factorial.
public class Q2 
 {   
    public static void factorial(int f)
    {    int fact=1,i;
        for( i=1; i<=f; i++)
        {
            fact=fact*i;
        }
        System.out.print("factorial="+fact);
    }
        public static void main(String args[])
        {   
            factorial(5);
        }
}
    

