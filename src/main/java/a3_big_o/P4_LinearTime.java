package a3_big_o;

import java.util.ArrayList;
import java.util.List;

public class P4_LinearTime {
    public static void main(String[] args) {
        String[] arr = new String[]{"bbc", "apple", "ascii", "banana"};
        List<String> result = selectAStrings(arr);
        System.out.println(result);
    }

    /*
     * O(N) - a로 시작하는지 모두 탐색해야 함으로 원소가 증가함에 따라 단계가 선형적으로 증가함
     */
    private static List<String> selectAStrings(String[] arr) {
        List<String> newArr = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].startsWith("a")) {
                newArr.add(arr[i]);
            }
        }
        return newArr;
    }
}
