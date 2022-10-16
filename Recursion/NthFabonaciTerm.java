import java.util.Scanner;

public class NthFabonaciTerm{

    static int fabonaci(int n)
    {
        if(n==0)
            return 0;

        else if(n==1)
            return 1;

        return fabonaci(n-1) + fabonaci(n-2);

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int term = s.nextInt();
        System.out.println(fabonaci(term));

    }
}
