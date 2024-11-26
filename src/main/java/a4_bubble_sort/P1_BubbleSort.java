package a4_bubble_sort;

import java.util.Arrays;

public class P1_BubbleSort {
    public static void main(String[] args) {
        int[] arr = {65, 55, 34, 25, 15, 10};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    private static int[] bubbleSort(int[] arr) {
        // 배열의 정렬여부
        boolean sorted = false;
        // 정렬되지 않은 배열의 가장 오른쪽 인덱스
        int unsortedUntilIndex =  arr.length - 1;
        while(!sorted) {
            sorted = true;
            for(int i = 0; i < unsortedUntilIndex; i++) {
                if(arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sorted = false;
                }
            }
            unsortedUntilIndex--;
        }
        return arr;
    }
}
