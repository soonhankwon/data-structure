package a6_insertion_sort;

import java.util.HashSet;
import java.util.Set;

public class P2_InterSection {
    public static void main(String[] args) {
        int[] arr0 = new int[]{1, 3, 4, 5, 6, 7, 8, 9};
        int[] arr1 = new int[]{1, 2, 3, 12, 42, 6, 8, 9};
        Set<Integer> result = intersection(arr0, arr1);
        System.out.println(result);
    }

    private static Set<Integer> intersection(int[] arr0, int[] arr1) {
        Set<Integer> result = new HashSet<>();
        // O(n * m)
        for(int i = 0; i < arr0.length; i++) {
            for(int j = 0; j < arr1.length; j++) {
                if(arr0[i] == arr1[j]) {
                    result.add(arr0[i]);
                    // 끝까지 비교하는 단계는 불필요함으로 break -> 최선 N번 비교
                    break;
                }
            }
        }
        return result;
    }
}
