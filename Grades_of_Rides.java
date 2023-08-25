import java.util.Scanner;
public class main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int hu=sc.nextInt();
        int sp=sc.nextInt();
        int sf=sc.nextInt();
        int grade;
        if(hu>50 && sp>60 && sf>100)
        {
            grade=10;
        }
        else if(hu>50 && sp>60)
        {
            grade=9;
        }
        else if(sp>60 && sf>100)
        {
            grade=8;
        }
        else if(hu>50 && sf>100)
        {
            grade=7;
        }
        else if(hu>50 || sp>60 ||sf>100)
        {
            grade=6;
        }
        else
        {
            grade=5;
        }
        System.out.print(grade);
       
    }
}