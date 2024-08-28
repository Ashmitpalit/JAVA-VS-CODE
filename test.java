import java.util.*;
class test
{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a[]=new int[5];
            int i;
            System.out.println("Enter the elements here");
            for(i=0;i<5;i++)
            {
                a[i]=sc.nextInt();
            }
            System.out.println("Your elements are ");
            
            System.out.println(Arrays.toString(a));
        }
    }
}