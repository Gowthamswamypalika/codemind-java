import java.util.Scanner;
public class main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b)
        {
            System.out.printf("%d",a);
        }
        else
        {
            System.out.printf("%d",b);
        }
    }
}