// to check whether is a prime number or not
import java.util.*;
class Prime
{
    static int num;
    int f=2;
    void input()
    {
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter a number");
            num=sc.nextInt();
        }
    }
    int checkprime(int a,int b)
    {
        if(b==1)
        {
            return 1;
        }
        if(a%b==0)
        {
            return 0;
        }
        return checkprime(a,b-1);
    }
    int checkprime2(int a)
    {
        if(f==a)
        {
            return 1;
        }
        else
        {
            if(a%f++==0)
            {
                return 0;
            }
            else
            {
                return checkprime2(a);
            }
        }
    }
    public static void main(String args[])
    {
        Prime ob=new Prime();
        ob.input();
        if(ob.checkprime(num,num/2)==1)
        {
           System.out.println("It is a Prime number");
        }
        else
        {
            System.out.println("It is not a Prime number");
        }
        if(ob.checkprime2(num)==1)
        {
           System.out.println("It is a Prime number");
        }
        else
        {
            System.out.println("It is not a Prime number");
        }
    }

}