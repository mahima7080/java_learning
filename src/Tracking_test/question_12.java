package Tracking_test;
//factorial using while
import java.util.Scanner;

public class question_12 {
    public static void main(String[] args) {
        int num,fact=1;
        System.out.println("enter number");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        if (num==0)
        {
            System.out.println("1");
            return;
        }

        while(num>0)
        {
            fact=fact* num;
            num--;
        }
        System.out.println(fact);
    }
}
