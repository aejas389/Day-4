import java.util.*;
public class Primeornot2
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int j=0;j<=t;j++)
        {
            int n=sc.nextInt();
            int c=0;
            for (int i=1;i*i<=n;i++)
            {
            if((n%i)==0)
            {
             c+=1;
             if (i*i!=n)
             {
                c+=1;
             }
            }
            }
            if(c==2)
            {
                System.out.println("prime number");
            }
            else
            {
                System.out.println("not prime number");
            }
        }
            
    }
}

