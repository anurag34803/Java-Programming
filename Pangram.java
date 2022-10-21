import java.util.Scanner;

class Pangram{
     static boolean checkIfPangram(String s) {
        boolean array[] = new boolean[26];
        boolean condition = true;
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            array[c - 'a'] = true;
        }

        for(int i=0;i<26;i++)
        {
            if(array[i] != true)
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(checkIfPangram(s));
    }
}
