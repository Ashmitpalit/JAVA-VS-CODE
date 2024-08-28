// to print the Fibonacci Series
import java.util.*;
class FibonacciRecursion
{
    int n,i;
    int n1=0,n2=1,n3=0;
    int fibo(int x)
    {
        if(x==0)
        {
            return 0;
        }
        if(x==1)
        {
            return 1;
        }
        return fibo(x-1)+fibo(x-2);
    }
    /*void fibo(int c)
    {
        if(c>0)
        {
           n3=n1+n2;
           System.out.print(n3+",");
           n1=n2;
           n2=n3;
           fibo(c-1);
        }
    }*/
    void limit()
    {
        int i;
        for(i=0;i<=n ;i++)
        {
           System.out.print(fibo(i)+", ");
        }
    }
    void accept()
    {
        System.out.println("Enter a number");
        try (Scanner sc = new Scanner(System.in)) {
            n=sc.nextInt();
        }
    }
    public static void main(String args[])
    {
       FibonacciRecursion ob=new FibonacciRecursion();
       ob.accept();
       ob.limit();
       
    }
}