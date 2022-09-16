import java.util.Scanner;

public class NumberReverse {

    static void reverse(int number)
    {
        int reverse = 0;

        while(number!=0)
        {
            reverse = reverse*10 + (number%10);
            number = number/10;
        }
        System.out.println(reverse);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        reverse(a);
    }
}
