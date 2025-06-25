package functions;

import java.util.Scanner;

public class func_2 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        if (!sc.hasNextInt())
        {
            System.out.println("enter no");
            return;
        }
        a=sc.nextInt();
        b=sc.nextInt();

       int d= div(a,b);
        System.out.println(d);}

    static int div(int a,int b)
    {
        if (b==0)
        {
            System.out.println("b cannot be 0");
        //  System.exit(0);
            return 0;
        }
        else
        {
        return a/b;}
    }
}
