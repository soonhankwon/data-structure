package a2_sorted_array;

public class P1_SortedArray {
    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5};
        Integer result = search(sortedArray, 55);
        System.out.println(result);
    }

    private static Integer search(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                return i;
            }
            // 찾고 있던 값보다 큰 원소에 도달하면 루프를 일찍 종료할 수 있다.
            else if(nums[i] > target) {
                break;
            }
        }
        return null;
    }
}
