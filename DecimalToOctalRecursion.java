// to convert a decimal number to its equivalent number
import java.util.Scanner;
class DecimalToOctalRecursion
{
    int oct,d;
    void oct(int x)
    {
        if(x==0)
        {
            System.out.println(oct);
        }
        else
        {
            d=x%8;
            oct=oct*10+d;
            oct(x/8);
        }
    }
    public static void main(String args[])
    {
       try (Scanner sc = new Scanner(System.in)) {
        int n;
           System.out.println("Enter a decimal number");
           n=sc.nextInt();
           DecimalToOctalRecursion ob=new DecimalToOctalRecursion();
           ob.oct(n);
    }
    }
}