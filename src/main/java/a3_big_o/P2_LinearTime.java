package a3_big_o;

public class P2_LinearTime {
    public static void main(String[] args) {
        int sum = arraySum(new int[]{1, 2, 3});
        System.out.println(sum);
    }

    /*
     * O(N) - arr 원소의 수에 비례해서 단계가 증가한다.
     */
    private static int arraySum(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
