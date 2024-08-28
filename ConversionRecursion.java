/* to convert a /*decimal number*/
import java.util.*;
class ConversionRecursion
{
    static int num;
    int bin;
    int oct;
    int hex;
    ConversionRecursion()
    {
        num=0;
        bin=0;
        oct=0;
        hex=0;
    }
    void accept()
    {
        try (Scanner sc = new Scanner(System.in)) 
        {
            System.out.println("Enter a decimal number");
            num=sc.nextInt();
        }
    }
    int decToBin(int x)
    {
        if(x==0)
        {
            return bin;
        }
        else
        {
            int m=x%2;
            bin=bin*10+m;
            return decToBin(x/2);
        }
    }
    int decToOct(int x)
    {
        if(x==0)
        {
            return oct;
        }
        else
        {
            int m=x%8;
            oct=oct*10+m;
            return decToOct(x/8);
        }
    }
    int decToHex(int x)
    {
        if(x==0)
        {
            return hex;
        }
        else
        {
            int m=x%16;
            hex=hex*10+m;
            return decToHex(x/16);
        }
    }
    public static void main(String args[])
    {
        ConversionRecursion ob=new ConversionRecursion();
        ob.accept();
        System.out.println(ob.decToBin(num));;
        System.out.println(ob.decToOct(num));
        int h;
        h=ob.decToHex(num);
        if(h<=9)
        {
            System.out.println(h);
        }
        else
        {
            System.out.println((char)(h+55));
        }
        
    }
}