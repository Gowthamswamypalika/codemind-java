import java.util.Scanner;
public class hi{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double n1=sc.nextDouble();
        double n2=sc.nextDouble();
        double n3=n1*n2;
        System.out.printf("%.2f",n3);
    }
}