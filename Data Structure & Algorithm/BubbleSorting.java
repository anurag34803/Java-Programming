import java.util.Scanner;
import java.util.Arrays;

public class BubbleSorting{

    static void BubbleSort(int arr[])
    {
        for(int i=0; i<(arr.length - 1); i++)
        {
            int count = 0;
            for(int j=0;j<(arr.length-1-i);j++)
            {

                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    count++;
                }
            }
            if(count == 0)  // if count == 0 this means arrays are already sorted we don't need to wait for loop
                break;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []Array = {9,1,31,7,4,1,5};
        BubbleSort(Array);

    }
}
