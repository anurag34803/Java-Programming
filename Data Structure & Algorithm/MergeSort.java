import java.util.Arrays;

public class MergeSort{
    static void merge(int ar[],int mid,int si,int ei)
    {
        int new_arr[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;

       while(i<=mid && j<=ei)
        {
            if (ar[i] < ar[j])
            {
                new_arr[k] = ar[i];
                i++;
                k++;
            }

            else
            {
                new_arr[k] = ar[j];
                j++;
                k++;
            }
        }

        while(i<=mid)
        {
            new_arr[k] = ar[i];
            i++;
            k++;
        }

        while(j<=ei)
        {
            new_arr[k] = ar[j];
            j++;
            k++;
        }

       for(k=0,i=si;k<new_arr.length;k++,i++)
        {
           ar[i] = new_arr[k];
        }
    }

    static void ms(int A[],int si,int ei)
    {

       if(si<ei)
        {
            int mid = si + (ei - si)/2;
            ms(A,si,mid);
            ms(A,mid+1,ei);
            merge(A,mid,si,ei);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 7, 4, 6, 3,9, 8,3};
        int ei = arr.length - 1;                    // ei means ending endex and si means starting index
        ms(arr, 0, ei);
        System.out.println(Arrays.toString(arr));
    }
}
