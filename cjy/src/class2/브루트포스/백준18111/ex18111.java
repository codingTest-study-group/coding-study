package class2.브루트포스.백준18111;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex18111 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int[][] nums = new int[N][M];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                nums[i][j] = Integer.parseInt(st.nextToken());
                min = Math.min(min, nums[i][j]);
                max = Math.max(max, nums[i][j]);
            }
        }
        int minTime = Integer.MAX_VALUE;
        int high = 0;
        while (min <= max) {
            int blockStock = B;
            int time = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (max > nums[i][j]) {
                        blockStock -= max - nums[i][j];
                        time += max - nums[i][j];
                    } else if (max < nums[i][j]) {
                        blockStock += nums[i][j] - max;
                        time += (nums[i][j] - max) * 2;
                    }
                }
            }
            if (blockStock >= 0) {
                if (minTime <= time) {
                    break;
                }
                minTime = time;
                high = max;
            }
            max--;
        }
        System.out.printf(minTime + " " + high);
    }
}