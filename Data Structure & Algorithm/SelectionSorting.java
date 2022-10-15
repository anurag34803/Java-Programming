import java.util.Arrays;

public class SelectionSorting{

    static void selectionsort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int minipos = i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[minipos] > arr[j])
                {
                    minipos = j;
                }
            }
            int temp = arr[minipos];
            arr[minipos] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args){
        int []Array = {9,1,31,7,1,4,3,5};
        selectionsort(Array);

    }
}

