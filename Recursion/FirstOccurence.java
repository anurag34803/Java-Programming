import java.util.Scanner;

public class FirstOccurence{

    static int firstccurence(int[] arr,int index,int search)
    {
        if(index==arr.length)
            return -1;

        else if(arr[index]== search)
            return index;

        return firstccurence(arr,index+1,search);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5,4,9,1,9,6,39,4};
        System.out.println("Enter Element you want to search");
        int n = sc.nextInt();
        System.out.println(firstccurence(arr,0,n));
    }
}
