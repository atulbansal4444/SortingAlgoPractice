package InsertionSorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSorting
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int []arr = new int[size];
        for (int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }

        for (int i=1;i<arr.length;i++)
        {
            int key = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        System.out.println("Sorted array");
        System.out.println(Arrays.toString(arr));
    }
}
