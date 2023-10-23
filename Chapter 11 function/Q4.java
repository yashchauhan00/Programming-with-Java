public class Q4 {
    public static int check(int n){
        int count=0;
        for(int i=1; i<=n;  i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
           
        }
        else
        {
            System.out.print("Not prime");
        }
    }
    public static int main(String args[]){
        System.out.print(check(7));
    }
    
}
