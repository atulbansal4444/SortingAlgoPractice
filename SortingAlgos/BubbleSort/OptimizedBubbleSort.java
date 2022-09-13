package SortingAlgos.BubbleSort;

import java.util.Arrays;
import java.util.Scanner;

public class OptimizedBubbleSort
{
    private static void swap(int i, int j, int []arr)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
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

        for (int i=0;i<arr.length-1;i++)
        {
            boolean isSwap = false;
            for (int j=i+1; j<arr.length;j++)
            {
                if (arr[i] > arr[j])
                {
                    isSwap = true;
                    swap(i, j, arr);
                }
            }
            if (!isSwap)
            {
                break;
            }
        }

        System.out.println("Sorted array");
        System.out.println(Arrays.toString(arr));
    }
}
