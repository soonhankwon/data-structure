package a4_bubble_sort;

public class P2_LinearSolution {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 7};
        System.out.println(hasDuplicateValueQuadratic(arr));
        System.out.println(hasDuplicateValueLinear(arr));
    }

    /*
     * O(N^2) -> steps: 14
     */
    private static boolean hasDuplicateValueQuadratic(int[] arr) {
        int steps = 0;
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - 1; j++) {
                steps++;
                if(i != j && arr[i] == arr[j]) {
                    System.out.println(steps);
                    return true;
                }
            }
        }
        System.out.println(steps);
        return false;
    }

    /*
     * O(N) -> steps: 4
     */
    private static boolean hasDuplicateValueLinear(int[] arr) {
        int[] existingNumbers = new int[7];
        int steps = 0;
        for(int i = 0; i < arr.length; i++) {
            steps++;
            // 1.1 중복확인 배열에서 인덱스의 값이 1이라면 중복 true
            if(existingNumbers[arr[i]] == 1) {
                System.out.println(steps);
                return true;
            }
            // 1.2 중복확인 배열에서 인덱스의 값이 0이라면 중복 false
            else {
                existingNumbers[arr[i]] = 1;
            }
        }
        System.out.println(steps);
        return false;
    }
}
