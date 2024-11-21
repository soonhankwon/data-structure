package a2_sorted_array;

public class P2_BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8 ,9, 10};
        Integer result = binarySearch(arr, 9);
        System.out.println(result);
    }

    private static Integer binarySearch(int[] arr, int target) {
        int lowerBound = 0;
        int upperBound = arr.length - 1;

        while(lowerBound <= upperBound) {
            int midPoint = (upperBound + lowerBound) / 2;
            int valueAtMidPoint = arr[midPoint];
            if(target > valueAtMidPoint) {
                lowerBound = midPoint + 1;
            } else if(target < valueAtMidPoint) {
                upperBound = midPoint - 1;
            } else {
                return midPoint;
            }
        }
        return null;
    }
}
