package class2.스택.ex1874;
// push 와 pop 을 가지고 주어진 수열을 만들 수 있는지 판단하고 없다면 'NO' 출력
// 있다면 + (push), - (pop) 을 이용하여 주어진 순열을 만들 수 있게 기호를 나열하라


import java.util.Scanner;
import java.util.Stack;

public class ex1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        StringBuilder result = new StringBuilder();
        Stack<Integer> stand = new Stack<>();
        Stack<Integer> processed = new Stack<>();
        int currentNum = 1;
        int index = 0;

        while (index < N) {
            if (!stand.empty() && nums[index] == stand.peek()) {
                processed.push(stand.pop());
                result.append("-\n");
                index++;
            }
            else if (currentNum <= N) {
                stand.push(currentNum);
                result.append("+\n");
                currentNum++;
            }
            else {
                result = new StringBuilder("NO");
                break;
            }
        }
        System.out.println(result);
    }
}