package Tracking_test_String;
/**
Write a program that demonstrates the performance difference between String concatenation,
 StringBuilder, and StringBuffer for multiple string operations.
 */
public class question_3 {
  final static int iteration=1000;
    public static void main(String[] args) {
        String str="hello";
        String s="";
        for (int i=0;i<iteration;i++)
        {
            s=s+str;
        }
        System.out.println(s);
        StringBuilder sb=new StringBuilder();

        for (int i=0;i<iteration;i++)
        {
            sb.append(i);
        }
        System.out.println(sb);
        StringBuffer sf=new StringBuffer();

        for (int i=0;i<iteration;i++)
        {
            sf.append(i);
        }
        System.out.println(sf);
    }

}
