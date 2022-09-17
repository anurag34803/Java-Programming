import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int length = s.length();
        boolean result = true;


        for(int i=0;i<(length/2);i++)
        {
            length--;
            if(s.charAt(i) != s.charAt(length))
            {
                result = false;
                System.out.println("Not a Plaindrome String");
                break;
            }
        }

        if(result)
            System.out.println("Palindrome String");

    }
}
