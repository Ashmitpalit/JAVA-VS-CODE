class pattern5
{
    public static void main(String args[])
    {
        int i,j,c=1;
        for(i=1;i<=4;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(c++ +" ");
            }
            c=1;
            System.out.println();
        }
    }
}