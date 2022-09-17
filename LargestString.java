public class LargestString{
    public static void main(String[] args) {
        String[] a = {"apple","mango","orange","watermelon","anger"};
        String largest = a[0];

        for(int i = 0;i<a.length;i++)
        {

            if(largest.compareTo(a[i]) < 0)
                largest = a[i];
        }
        System.out.println(largest);
    }
}
