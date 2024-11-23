package b1_stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P1935_후위표기식2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String exp = br.readLine();
        double[] arr = new double[n];
        for(int i = 0; i < n; i++) {
            arr[i] = Double.parseDouble(br.readLine());
        }
        Stack<Double> stack = new Stack<>();
        for (char c : exp.toCharArray()) {
            if (c != '+' && c != '-' && c != '*' && c != '/') {
                stack.push(arr[c - 'A']);
            } else {
                // 중요! 스택에서 먼저 pop 요소가 두번째 피연산자(op2), 그 다음 pop 요소가 첫번째 피연산자(op1)
                double op2 = stack.pop();
                double op1 = stack.pop();
                switch (c) {
                    case '+':
                        stack.push(op1 + op2);
                        break;
                    case '-':
                        stack.push(op1 - op2);
                        break;
                    case '*':
                        stack.push(op1 * op2);
                        break;
                    case '/':
                        stack.push(op1 / op2);
                        break;
                }
            }
        }
        System.out.printf("%.2f\n", stack.peek());
        br.close();
    }
}
