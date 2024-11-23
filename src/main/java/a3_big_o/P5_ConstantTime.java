package a3_big_o;

public class P5_ConstantTime {
    public static void main(String[] args) {
        int median = median(new int[]{1, 2, 5, 7, 8, 100});
        System.out.println(median);
    }
    /*
     * O(1) - 배열의 원소수의 증가와 상관없이 똑같은 단계수를 가진다.
     */
    private static int median(int[] arr) {
        int middle = arr.length / 2;
        if(arr.length % 2 == 0) {
            // 1step
            return (arr[middle - 1] + arr[middle]) / 2;
        } else {
            return arr[middle];
        }
    }
}
