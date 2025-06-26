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
        long start1 = System.currentTimeMillis();
        for (int i=0;i<iteration;i++)
        {
            s=s+str;
        }
        long end1 = System.currentTimeMillis();
        System.out.println("String: "+(end1-start1)+"ms");


        long start2 = System.currentTimeMillis();
        StringBuilder sb=new StringBuilder();

        for (int i=0;i<iteration;i++)
        {
            sb.append(i);
        }
        long end2 = System.currentTimeMillis();
        System.out.println("StringBuilder: "+(end2-start2)+"ms");





        long start3 = System.currentTimeMillis();
        StringBuffer sf=new StringBuffer();

        for (int i=0;i<iteration;i++)
        {
            sf.append(i);
        }
        long end3 = System.currentTimeMillis();
        System.out.println("StringBuffer: "+(end3-start3)+"ms");


    }

}
