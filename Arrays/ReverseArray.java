import java.util.Arrays;

public class ReverseArray{
    public static void main(String[] args) {
        int array[] = {1,2,5,4,6,7,8,9};

        int length = array.length;

        for(int i=0;i<((array.length)/2);i++)
        {
            int temp = array[i];
            array[i] = array[length-1];
            array[length-1] = temp;
            length--;
        }

        System.out.println(Arrays.toString(array));
    }
}
