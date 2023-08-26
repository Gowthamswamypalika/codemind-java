import java.util.Scanner;
public class main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        if(i==2)
        {
            System.out.print(1);
        }
         else if(i==1)
        {
            System.out.print(0);
        }
        else
        {
           System.out.print(2);
        }
    }
}