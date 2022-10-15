import java.util.Arrays;

public class InsertionSorting{

    static void insertionsort(int []arr)
    {
        for(int i=1;i<arr.length;i++)
        {
            int key = arr[i];
            int j = i-1;

            while(j >=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int []Array = {9,1,31,7,1,4,3,5};
        insertionsort(Array);
    }
}
