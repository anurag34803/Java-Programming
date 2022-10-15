import java.util.Scanner;
import java.util.Arrays;

public class CountSorting{

    static void countsort(int arr[])
    {
        // find maximum element from array
        int largest = arr[0];
        for(int j=1;j<arr.length;j++)
                if(largest < arr[j])
                    largest = arr[j];

        largest++;

        //store number of times elemnts occur
        int frequency[] = new int[largest];

        //inserting 0 in frequency array
        for(int i=0;i<frequency.length;i++)
            frequency[i] = 0;

        //now we count frequency
        for(int i=0;i<arr.length;i++)
            frequency[arr[i]] = frequency[arr[i]] + 1;

        int j = 0;
        for(int i=0;i<frequency.length;i++)
        {
            while(frequency[i] > 0)
            {
                arr[j] = i;
                frequency[i] = frequency[i] - 1;
                j++;
            }

        }
        
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []Array = {1,3,9,2,1,4,3,9,5,8,6,7,3,6};
        countsort(Array);
    }
}
