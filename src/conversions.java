import java.util.Arrays;

public class conversions {
    public static void main(String[] args) {
        int num=294;
        String str=String.valueOf(num);
        //System.out.println(str);
        int[] arr= new int[str.length()];

        for (int i=0;i<arr.length;i++)
        {
          String s=String.valueOf(str.charAt(i)) ;
          arr[i]=Integer.parseInt(s);
            System.out.println(arr[i]);
        }
        Arrays.sort(arr);
        for (int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}
