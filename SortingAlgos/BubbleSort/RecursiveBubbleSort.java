package SortingAlgos.BubbleSort;

import java.util.Arrays;
import java.util.Scanner;

public class RecursiveBubbleSort
{
    private static void swap(int i, int j, int []arr)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void recursiveBubbleSort(int[] arr, int size)
    {
        if (size == 0 || size == 1)
        {
            return;
        }
        for (int i=0;i<size-1;i++)
        {
            if (arr[i] > arr[i+1])
            {
                swap(i, i+1, arr);
            }
        }
        recursiveBubbleSort(arr, size-1);
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

        recursiveBubbleSort(arr, size);

        System.out.println("Sorted array");
        System.out.println(Arrays.toString(arr));
    }
}
