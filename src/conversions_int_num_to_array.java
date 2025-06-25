import java.util.Arrays;

public class conversions_int_num_to_array {
    public static void main(String[] args) {
//        System.out.println("hi");
// how to convert the string into character array
   /*  *   String  s="mahima";
        char[] arr=s.toCharArray();
        int l= arr.length;
        for (int i = 0;i<l;i++)
        {
            System.out.println(arr[i]);
        }*/

// how to convert the int into int array

        int  num=672;
        String s=String.valueOf(num);
        int[] arr=new int[s.length()];
        for (int i=0;i<s.length();i++)
        {
          String str= String.valueOf(s.charAt(i));
          arr[i]=Integer.parseInt(str);
//          System.out.println(arr[0]);
//            System.out.println(arr[1]);
//            System.out.println(arr[2]);


        }
        Arrays.sort(arr);
//        System.out.println(arr.toString());
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);

        }

    }
}

