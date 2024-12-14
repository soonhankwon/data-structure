package a6_insertion_sort;

import java.util.Arrays;

public class P1_InsertionSort {
    public static void main(String[] args) {
        int[] arr = {65, 55, 34, 25, 15, 10};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            // 임시로 제거중인 값
            int tempValue = arr[i];
            // 제거 중인 값의 왼쪽부터 비교를 시작함
            int position = i - 1;
            while (position >= 0) {
                // 왼쪽의 값이 더 크다면 오른쪽으로 시프트
                if(arr[position] > tempValue) {
                    arr[position + 1] = arr[position];
                    // 그리고 다음 비교할 인덱스는 왼쪽으로 이동
                    position = position - 1;
                } else {
                    break;
                }
                // 임시값을 제 위치에 삽입
                arr[position + 1] = tempValue;
            }
        }
    }
}
