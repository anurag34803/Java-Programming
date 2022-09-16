import java.util.Scanner;

public class BinomialCoefficient{

    static int factorial(int number)
    {
        int factorial = 1;
        while(number > 1)
        {
            factorial = number*factorial;
            number--;
        }

        return factorial;
    }
    static void binomial(int n,int r)
    {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_n_r = factorial((n-r));

        int cal = (fact_n) / fact_r*(fact_n_r);

        System.out.println(cal);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        binomial(n,r);
    }
}
