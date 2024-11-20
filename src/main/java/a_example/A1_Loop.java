package a_example;

public class A1_Loop {
    public static void main(String[] args) {
        loopVer1();
        loopVer2();
    }

    private static void loopVer1() {
        int number = 2;
        // execute 100times
        while(number <= 100) {
            System.out.println(number);
            number++;
        }
    }

    // more effective
    private static void loopVer2() {
        int number = 2;
        // execute 50times
        while(number <= 100) {
            System.out.println(number);
            number += 2;
        }
    }
}
