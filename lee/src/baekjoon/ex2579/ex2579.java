package baekjoon.ex2579;

import java.util.Scanner;
//DP 문제
public class ex2579 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N + 1];
        int[] DP = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            arr[i] = sc.nextInt();
        }
        DP[1] = arr[1];
        if (N >= 2) {
            DP[2] = arr[1] + arr[2];
        }
        for (int i = 3; i <= N; i++) {
            DP[i] = Math.max(DP[i - 2], DP[i - 3] + arr[i - 1]) + arr[i];
        }
        System.out.println(DP[N]);
    }
}
