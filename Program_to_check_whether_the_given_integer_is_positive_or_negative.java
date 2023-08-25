import java.util.Scanner;
public class main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a<0)
        {
            System.out.print("Negative Number");
        }
        else
        {
            System.out.print("Positive Number");
        }
    }
}