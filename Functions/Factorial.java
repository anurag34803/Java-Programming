import java.util.Scanner;

public class factorial
{
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        System.out.println(factorial(a));

    }
}
