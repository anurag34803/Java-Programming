import java.util.Scanner;

public class Sum_Of_N_Natural_Number{

    static int sum(int n)
    {
        if(n==1 && n==0)
            return n;

        return n + sum(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
}
