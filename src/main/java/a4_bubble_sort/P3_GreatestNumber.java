package a4_bubble_sort;

public class P3_GreatestNumber {
    public static void main(String[] args) {
        System.out.println(greatestNumberLinear(new int[]{1, 4, 6, 7}));
    }

    private static int greatestNumberLinear(int[] arr) {
        int max = arr[0];
        for(int i = 1; i <= arr.length - 1; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}
