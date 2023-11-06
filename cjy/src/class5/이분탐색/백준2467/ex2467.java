package class5.이분탐색.백준2467;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//용액
// 산성 용액 / 알칼리성 용액
// 산성 1 ~ 1000000000
// 알칼리 -1 ~ -1000000000
public class ex2467 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        long result = Integer.MAX_VALUE;
        int x = 0;
        int y = nums.length - 1;
        int A = 0;
        int B = 0;
        while (x < y) {
            int value = nums[y] + nums[x];
            if (Math.abs(value) <= result) {
                A = nums[x];
                B = nums[y];
                result = Math.abs(value);
            }
            if (value > 0) {
                y--;
            } else {
                x++;
            }
        }
        System.out.printf(A + " " + B);
    }
}