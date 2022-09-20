import java.util.Scanner;

public class LinearSearch{

    static int search(int arrays[],int key)
    {
        for(int i=0;i<arrays.length;i++)
        {
            if(arrays[i] == key)
            {
                return i;
            }
        }

        return -1;

    }

    // this method work for string type here we use methodoverloading concept
    static int search(String arrays[],String key)
    {
        for(int i=0;i<arrays.length;i++)
        {
            if(arrays[i] == key)
            {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arrays[] = {5,10,20,6,45,98,41,25,6,2,8,4,21};
        int key = 987;

        //String arrays[] = {"Apple","Mango","Watermelon","Papaya","Orange"};
        //String key = "Watermelo";

        int result = search(arrays,key);

        if(result == -1)
        System.out.println("Not Found");

        else
            System.out.println("Available at Index " + result);
    }
}
