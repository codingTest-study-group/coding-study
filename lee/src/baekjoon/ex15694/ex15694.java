package baekjoon.ex15694;

import java.util.Scanner;
//백트래킹(dfs) 연습문제
public class ex15694 {
    static int N, M;
    static int[] arr;
    static boolean[] visit;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        visit = new boolean[N+1];
        arr = new int[M+1];

        dfs(0);
    }
    private static void dfs(int idx){
        if(idx ==M){//break 조건
            for (int i = 0; i < M; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= N; i++) {
            if(!visit[i]){
                visit[i]=true;
                arr[idx] = i;
                dfs(idx+1);
                visit[i] = false;
            }
        }
    }
}
