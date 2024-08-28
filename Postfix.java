// to evaluate a postfic expression
import java.util.*;
class Postfix
{
    static char a[];
    int top,max;
    Postfix()
    {
        top=-1;
        max=0;
        a=new char[max];
    }
    Postfix(int m)
    {
        top=-1;
        max=m;
        a=new char[max];
    }
    void push(char item)
    {
        if(top==max-1)
        {
            System.out.println("Statck Overflow)");
        }
        else
        {
            top++;
            a[top]=item;
        }
    }
    int pop()
    {
        if(top==-1)
        {
            System.out.println("Stack Underflow");
            return -1;
        }
        else
        {
            return Integer.valueOf(a[top]);
        }
    }
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) 
        {
            String exp;
            char k;
            int len,i,x,y;
            System.out.println("Enter an expression");
            exp=sc.nextLine();
            exp=exp.trim();
            len=exp.length();
            Postfix ob=new Postfix(len);
            for(i=0;i<len;i++)
            {
                k=exp.charAt(i);
                if(k=='0'||k=='1'||k=='2'||k=='3'||k=='4'||k=='5'||k=='6'||k=='7'||k=='8'
                  ||k=='9')
                {
                    ob.push(k);
                }  
                else if(k=='+')
                {
                    y=ob.pop();
                    x=ob.pop();
                    ob.push((char)(x+y));
                }
                else if(k=='-')
                {
                    y=ob.pop();
                    x=ob.pop();
                    ob.push((char)(x-y));
                }
                else if(k=='*')
                {
                    y=ob.pop();
                    x=ob.pop();
                    ob.push((char)(x*y));
                }
                else if(k=='/')
                {
                    y=ob.pop();
                    x=ob.pop();
                    ob.push((char)(x/y));
                }
            }
        }
        System.out.println("The answer is = "+ a[0]);
    }
}