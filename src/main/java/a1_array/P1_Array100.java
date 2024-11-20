package a1_array;

import java.util.ArrayList;
import java.util.List;

public class P1_Array100 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        for(int i = 1; i <= 100; i++) {
            arr.add(i);
        }
        // Calculate Step
        // 1. 읽기 - O(1) Index Access
        int num = arr.get(3);
        // 2. 배열에 들어 있지 않은 값 검색 - O(N): 100 Step
        int targetNum = 101;
        for (int e : arr) {
            if (e == targetNum) {
                break;
            }
        }
        /*
         * 3. 배열 맨 앞에 삽입
         * 배열의 요소 오른쪽 메모리 셀로 이동 Step 100
         * 배열의 앞에 삽입 Step 1
         * Step: 100 + 1
         */
        arr.add(0, 1000);

        /*
         * 4. 배열의 맨 뒤에 삽입
         * 배열 시작 메모리 주소와 배열의 크기를 알고 있음
         * 배열의 맨 뒤에 삽입 Step 1
         */
        arr.add(arr.size(), 1004);

        /*
         * 5. 배열의 맨 앞에서 삭제
         * 배열 맨 앞 삭제 Step 1
         * 남아있는 모든 요소를 왼쪽 메모리 셀로 이동 Step 100
         * Step: 1 + 100
         */
        arr.remove(0);

        /*
         * 6. 배열의 맨 뒤에서 삭제
         * 배열의 맨 뒤에서 삭제 Step 1
         */
        arr.remove(arr.size() - 1);
    }
}
