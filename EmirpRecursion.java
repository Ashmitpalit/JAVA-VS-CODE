// to check whether the number is EMIRP numbers or not
import java.util.*;
class EmirpRecursion
{
    int n,rev,f;
    EmirpRecursion(int nn)
    {
        n=nn;
        rev=0;
        f=2;
    }
    int isPrime(int x)
    {
        if(f==x)
        {
            return 1;
        }
        else
        {
            if(x%(f++)==0)
            {
                return 0;
            }
            else
            {
                return isPrime(x);
            }
        }
    }
    int isPrime(int x,int i)  
    {
       if(i==1)
       {
           return 1;
       }
       else
       {
           if(x%i==0)
           {
               return 0;
           }
           else
           {
               return isPrime(x,i-1);
           }
       }
    }
    void isEmirp(int num)
    {
        int ld,temp=n;
        while(temp!=0)
        {
            ld=temp%10;
            rev=(rev*10)+ld;
            temp/=10;
        }
        if(isPrime(n,n/2)==1 && isPrime(rev,rev/2)==1)
        {
            System.out.println("It is an Emirp Number");
        }
        else
        {
            System.out.println("It is not an Emirp nuumber");
        }
    }
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) 
        {
            int num;
            System.out.println("Enter a number");
            num=sc.nextInt();
            EmirpRecursion ob=new EmirpRecursion(num);
            ob.isEmirp(num);
        }
    }

}
