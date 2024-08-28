import java.util.*;
class dayoftheweek
{
    int checkCenturyCode(int c)
    {
    if(c>=1400 && c<=1499)
    {
        return 2;
    }
    else if(c>=1500 && c<=1599)
    {
        return 0;
    }
    else if(c>=1600 && c<=1699)
    {
        return 6;
    }
    else if(c>=1700 && c<=1799)
    {
        return 4;
    }
    else if(c>=1800 && c<=1899)
    {
        return 2;
    }
    else if(c>=1900 && c<=1999)
    {
        return 0;
    }
    else if(c>=2000 && c<=2099)
    {
        return 6;
    }
    else if(c>=2100 && c<=2199)
    {
        return 4;
    }
    else if(c>=2200 && c<=2299)
    {
        return 2;
    }
    else if(c>=2300 && c<=2399)
    {
        return 0;
    }
    else if(c>=2400 && c<=2499)
    {
        return 6;
    }
    else if(c>=2500 && c<=2599)
    {
        return 4;
    }
    else
    {
        return -1;
    }
    }
    int monthCode(int m)
    {
        if(m==1)
        {
            return 0;
        }
        else if(m==2)
        {
            return 3;
        }
        else if(m==3)
        {
            return 3;
        }
        else if(m==4)
        {
            return 6;
        }
        else if(m==5)
        {
            return 1;
        }
        else if(m==6)
        {
            return 4;
        }
        else if(m==7)
        {
            return 6;
        }
        else if(m==8)
        {
            return 2;
        }
        else if(m==9)
        {
            return 5;
        }
        else if(m==10)
        {
            return 0;
        }
        else if(m==11)
        {
            return 3;
        }
        else if(m==12)
        {
            return 5;
        }
        else
        {
            return -1;
        }
    }
    void displayDay(int x)
    {
        if(x==0)
        {
            System.out.println("Sunday");
        }
        else if(x==1)
        {
            System.out.println("Monday");
        }
        else if(x==2)
        {
            System.out.println("Tuesday");
        }
        else if(x==3)
        {
            System.out.println("Wednesday");
        }
        else if(x==4)
        {
            System.out.println("Thursday");
        }
        else if(x==5)
        {
            System.out.println("Friday");
        }
        else if(x==6)
        {
            System.out.println("Saturday");
        }
        else
        {
            System.out.println("None");
        }
    }
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) 
        {
            dayoftheweek ob=new dayoftheweek();
            String dob;
            int m,c,y,d,sum,dd,r;
            System.out.println("Enter you date of birth in dd/mm/yyyy format only");
            dob=sc.nextLine();
            m=ob.monthCode(Integer.valueOf(dob.substring(3,5)));
            c=ob.checkCenturyCode(Integer.valueOf(dob.substring(6)));
            y=Integer.valueOf(dob.substring(8));
            //year=Integer.valueOf(dob.substring(6));
            d=y/4;
            dd=Integer.valueOf(dob.substring(0,2));
            sum=dd+m+c+y+d;
            r=sum%7;
            //System.out.println(" "+dd+" "+m+" "+c+" "+y+" "+d+" "+sum+" "+r);
            ob.displayDay(r);
        }
        
    }
}