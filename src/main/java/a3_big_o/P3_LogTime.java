package a3_big_o;

public class P3_LogTime {
    public static void main(String[] args) {
        System.out.println(chessboardSpace(8));
    }
    /*
     * O(logN) - 쌀의 수가 증가해도 필요한 체스칸의 수는 로그적으로 증가함
     */
    private static int chessboardSpace(int numberOfGrains) {
        int chessboardSpaces = 1;
        int placedGrains = 1;

        while(placedGrains < numberOfGrains) {
            placedGrains *= 2;
            chessboardSpaces += 1;
        }
        return chessboardSpaces;
    }
}
