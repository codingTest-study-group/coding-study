package baekjoon.ex14888;

import java.util.Scanner;

/*
* 첫째 줄에 수의 개수 N(2 ≤ N ≤ 11)가 주어진다. 둘째 줄에는 A1, A2, ..., AN이 주어진다. (1 ≤ Ai ≤ 100) 셋째 줄에는 합이 N-1인 4개의 정수가 주어지는데,
*  차례대로 덧셈(+)의 개수, 뺄셈(-)의 개수, 곱셈(×)의 개수, 나눗셈(÷)의 개수이다.
* 출력은 첫째 줄에는 경우의수 중에 최댓값, 두번째 줄엔 최소값을 출력한다.
* 힌트 : 백트래킹
* */
public class ex14888 {

    static int[] num;
    static int[] OP = new int[4];
    static int MAX =Integer.MIN_VALUE;
    static int MIN =Integer.MAX_VALUE;
    static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        num = new int[N];

        for (int i = 0; i < N; i++) {
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            OP[i] = sc.nextInt();
        }
        dfs(num[0],1);

        System.out.println(MAX);
        System.out.println(MIN);

    }

    public static void dfs(int n, int index){
        if(index == N){
            MAX = Math.max(MAX, n);
            MIN = Math.min(MIN, n);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if(OP[i] > 0){
                OP[i]--;

                switch (i){

                    case 0: dfs(n + num[index],index+1); break;
                    case 1: dfs(n - num[index],index+1); break;
                    case 2: dfs(n * num[index],index+1); break;
                    case 3: dfs(n / num[index],index+1); break;

                }
                OP[i]++;
            }
        }
    }
}
