package programmers.kakao2023;

import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {
        int cap = 4;
        int n = 5;
        int[] deliveries = new int[n];
        int[] pickups = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            deliveries[i] = sc.nextInt();
            System.out.println("---------------");
            pickups[i] = sc.nextInt();
        }
        System.out.println(solution(cap, n, deliveries, pickups));
    }

    public static long solution(int cap, int n, int[] deliveries, int[] pickups) {
        int d = 0;
        int p = 0;
        long answer = 0;
        for (int i = n - 1; i >= 0; i--) {
            d -= deliveries[i];
            p -= pickups[i];
            while (d < 0 || p < 0) {
                d += cap;
                p += cap;
                answer += (i+1)*2;
            }
        }
        return answer;
    }
}