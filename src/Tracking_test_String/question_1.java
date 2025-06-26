package Tracking_test_String;
/**
Write a Java program that demonstrates basic string operations including concatenation, length, substring, and character extraction.


 */
public class question_1 {
    public static void main(String[] args) {
        String str1="Hello World";
        int len=str1.length();
        System.out.println("length: " + len);
        char ch= str1.charAt(0);
        System.out.println("first char:"+ch);
        str1=str1.substring(6);
        System.out.println(str1);
        str1=str1.concat(" hi");
        System.out.println(str1);

    }
}
