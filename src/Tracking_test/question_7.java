package Tracking_test;

import java.util.Scanner;

public class question_7 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();

        b=sc.nextInt();
        c=sc.nextInt();
        int result=a>b? a: b>c? b:c;
        System.out.println(result);
    }
}
