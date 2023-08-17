import java.util.Scanner;
public class main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(y*30<=x)
        {
            System.out.print("YES");
        }
        else
        {
            System.out.print("NO");
        }
    }
}