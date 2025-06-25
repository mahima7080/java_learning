package Tracking_test;

import java.util.Scanner;

public class question_9 {
    public static void main(String[] args) {

            int day_no;

            System.out.println("enter no  1 for monday , 2 tuesday , 3 for wedenesday , 4 for thursday , 5 for friday, 6 for saturday 7 f0r sunday");

            Scanner sc=new Scanner(System.in);
            day_no=sc.nextInt();
            switch (day_no)
            {
                case 1:
                {
                    System.out.println(" monday");
                    break;
                }
                case 2:
                {
                    System.out.println(" tuesday");
                    break;
                }
                case 3:
                {
                    System.out.println(" wednesday");
                    break;
                }
                case 4:
                {
                    System.out.println(" thursday");
                    break;
                }
                case 5:
                {
                    System.out.println(" friday");
                    break;
                }
                case 6:
                {
                    System.out.println(" saturday");
                    break;
                }
                case 7:
                {
                    System.out.println(" sunday");
                    break;
                }
                default:
                    System.out.println("invalid no");
                    break;
            }
        }

}
