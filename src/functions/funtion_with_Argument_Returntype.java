package functions;

public class funtion_with_Argument_Returntype {
    public static void main(String[] args) {
           int div=divide(10,0);
        System.out.println(div);
    }
    static int divide(int a, int b)
    {
        if (b==0)
        {
            System.out.println("b should not be 0");
        System.exit(0);
           // throw new ArithmeticException("b can't be zero");
        }
        return a/b;
    }
}
