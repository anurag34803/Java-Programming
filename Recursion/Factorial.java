import java.util.Scanner;

public class Factorial{

    static int factorial(int n)
    {

        if(n==0)
            return 1;

        int fn = n*factorial(n-1);
        return fn;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
}
