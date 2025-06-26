package Tracking_test_String;

/**
Create a program that demonstrates different ways
to compare strings in Java, including == operator, equals(), equalsIgnoreCase(),
and compareTo() methods.
 */
public class question_2 {
    public static void main(String[] args) {
        String str1="Hello",str2="hello";
        String str3="HelLo";
        System.out.println();
        System.out.println("equals(): " +str1.equals(str2));
        System.out.println("equalIgnoreCase():"+str1.equalsIgnoreCase(str2));
        System.out.println("compareTo(): "+ str3.compareTo(str2));
    }
}
