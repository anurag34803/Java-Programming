import java.util.Scanner;

public class Fabonaci_Series{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int first = 0;
        int second = 1;
        System.out.print(first + " ");
        System.out.print(second + " ");
        n-=2;

        for(int i=0;i<n;i++)
        {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
}
