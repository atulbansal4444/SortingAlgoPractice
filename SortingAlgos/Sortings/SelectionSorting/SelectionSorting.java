package SelectionSorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSorting
{
    private static void swap(int i, int j, int []arr)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int findMinIndex(int j, int []arr)
    {
        int index = j;
        int min = arr[j];
        for (int i = j+1; i < arr.length; i++)
        {
            if (min > arr[i])
            {
                min = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int []arr = new int[size];
        for (int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i =0; i < arr.length - 1; i++)
        {
            swap(i, findMinIndex(i, arr), arr);
        }

        System.out.println("Sorted array");
        System.out.println(Arrays.toString(arr));
    }
}
