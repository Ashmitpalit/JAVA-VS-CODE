// to check whether a number is a diasarium number
import java.util.Scanner;
class DiasariumRecursion
{
    int num,size;
    DiasariumRecursion(int nn)
    {
        num=nn;
        size=0;
    }
    void countDigits()
    {
        int temp=num;
        while(temp!=0)
        {
            size++;
            temp/=10;
        }
    }
    int sumOfDigits(int n,int p)
    {
        if(p==1)
        {
            return n;
        }
        else
        {
            return n*sumOfDigits(n,--p);
        }
    }
    void check()
    {
        int sum=0,ld;
        int temp=num;
        while(temp!=0)
        {
           ld=temp%10;
           sum+=sumOfDigits(ld, size);
           temp/=10;
           size--;
        }
        if(sum==num)
        {
            System.out.println("It is a diasarium number");
        }
        else
        {
            System.out.println("It is not a diasarium number");
        }
    }
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            int n;
            System.out.println("Enter a number");
            n=sc.nextInt();
            DiasariumRecursion ob=new DiasariumRecursion(n);
            ob.countDigits();
            ob.check();
        }

    }

}