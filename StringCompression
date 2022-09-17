import java.util.Scanner;

public class StringCompression{
    static void compression(String s)
    {
        StringBuilder sb = new StringBuilder();

        int i = 0;
        while(i < s.length())
        {
            char character = s.charAt(i);
            int count = 0;
            while(i < s.length() && s.charAt(i) == character)
            //while(i < (s.length()-1) && s.charAt(i) == s.charAt(i+1))
            {
                count++;
                i++;
            }
            sb.append(character);
            sb.append(count);
        }

        System.out.println(sb);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        compression(s);
    }
}
