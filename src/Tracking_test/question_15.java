package Tracking_test;

public class question_15 {
    public static void main(String[] args) {
        int i, num, count;


        for (num = 1; num <= 100; num++) {
            count = 0;
            for (i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    count++;
                    break;
                }
            }


            if (count == 0 && num != 1) {
                System.out.println(num);
            }
        }
    }
}
