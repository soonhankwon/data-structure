package a3_big_o;

public class P1_ConstantTime {
    public static void main(String[] args) {
        boolean isLeapYear = isLeapYear(2024);
        System.out.println(isLeapYear);
    }
    /*
     * O(1) 알고리즘 - 데이터의 수와 상관없이 2단계
     */
    private static boolean isLeapYear(int year) {
        return (year % 100 == 0) ? (year % 400 == 0) : (year % 4 == 0);
    }
}
