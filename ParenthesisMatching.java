// to check whether an expression is valid or not
import java.util.*;
class ParenthesisMatching
{
    char a[];
    int top,max;
    ParenthesisMatching()
    {
        top=-1;
        max=0;
        a=new char[max];
    }
    ParenthesisMatching(int m)
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
    void pop()
    {
        if(top==-1)
        {
            System.out.println("Stack Underflow");
        }
        else
        {
            top--;
        }
    }
    boolean check()
    {
        if(top==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) 
        {
            int len,i;
            char k;
            String exp;
            System.out.println("Enter an expression");
            exp=sc.nextLine();
            len=exp.length();
            ParenthesisMatching ob=new ParenthesisMatching(len);
            for(i=0;i<len;i++)
            {
                k=exp.charAt(i);
                if(k=='(')
                {
                    ob.push('(');
                }
                else if(k==')')
                {
                    ob.pop();
                }
            }
            if(ob.check()==true)
            {
                System.out.println("Expression is correct");
            }
            else
            {
                System.out.println("Expression is wrong");
            }
        }
    }
}