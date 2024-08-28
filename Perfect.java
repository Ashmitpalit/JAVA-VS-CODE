// to check whether a number is a Perfect number or not
import java.util.*;
class Perfect
{
    int num,sum;
    Perfect()
    {
        num=0;
        sum=0;
    }
    void accept()
    {
        
            try (Scanner sc = new Scanner(System.in)) 
            {
                System.out.println("Enter a number");
                num=sc.nextInt();
            }
    }
    int factorSum(int a)
    {
        if(a==0)
        {
            return sum;
        }
        else
        {
            if(num%a==0)
            {
                sum+=a;
            }
            else
            {
                sum+=-1;
            }
        }
        return factorSum(a-1);
    }
    int perf(int a)
    {
        if(a==1)
        {
            return 1;
        }
        else
        {
            if(num%a==0)
            {
                return a+perf(a-1);
            }
            else
            {
                return -1;
            }
        }
    }
    void display()
    {
        if(factorSum(num/2)==num)
        {
            System.out.println("It is a Perfect number");
        }
        else
        {
            System.out.println("It is not a Perfect number");
        }
    }
    void display1()
    {
        if(perf(num/2)==num)
        {
            System.out.println("It is a Perfect number");
        }
        else
        {
            System.out.println("It is not a Perfect number");
        }
    }
    public static void main(String args[])
    {
        Perfect ob=new Perfect();
        ob.accept();
        ob.display();
        ob.display1();
    }
}