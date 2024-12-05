import java.util.*;
public class CountofDivisor
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        int c=0;

            for(int i=1;i*i<=n;i++){
                if(n%1==0)
                {
                    c+=1;
                    if(i*1!=n)
                    {
                        c+=1;
                    }
                }
            }
        System.out.println(c);
    }
}
    

