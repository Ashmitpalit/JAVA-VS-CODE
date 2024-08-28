// to convert a word into its piglatin form
import java.util.*;
class Piglatin
{
    String str,newstr;
    int len;
    Piglatin()
    {
        str="";
        newstr="";
        len=0;
    }
    void readWord()
    {
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter a string");
            str=sc.nextLine();
        }
    }
    void convert()
    {
        String x="";
        int i;
        char k;
        len=str.length();
        for(i=0;i<len;i++)
        {
            k=str.charAt(i);
            if(k=='A' || k=='E' || k=='I' || k=='O'|| k=='U')
            {
                 x=str.substring(0,i);
                 newstr=str.substring(i)+x+"AY";
            }
        }
    }
    void display()
    {
        System.out.println(str);
        System.out.println(newstr);
    }
    public static void main(String args[])
    {
        Piglatin ob=new Piglatin();
        ob.readWord();
        ob.convert();
        ob.display();
    }
}