package a5_selection_sort;

import java.util.Arrays;

public class P1_SelectionSort {
    public static void main(String[] args) {
        int[] arr = {65, 55, 34, 25, 15, 10};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            int lowestNumberIndex = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[lowestNumberIndex]) {
                    lowestNumberIndex = j;
                }
            }
            if(lowestNumberIndex != i) {
                int temp = arr[i];
                arr[i] = arr[lowestNumberIndex];
                arr[lowestNumberIndex] = temp;
            }
        }
    }
}
