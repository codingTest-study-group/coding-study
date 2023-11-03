package class5.기하학.백준2166;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 다각형 면적을 구하여라
// 힌트 -> 신발끈 공식
public class ex2166 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] coordinates = new int[N+1][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            coordinates[i][0] = Integer.parseInt(st.nextToken());
            coordinates[i][1] = Integer.parseInt(st.nextToken());
        }
        coordinates[N][0] = coordinates[0][0];
        coordinates[N][1] = coordinates[0][1];

        long A = 0;
        long B = 0;
        for (int i = 0; i < N; i++) {
            A += (long) coordinates[i][0] * coordinates[i + 1][1];
            B += (long) coordinates[i][1] * coordinates[i + 1][0];
        }
        long sum = Math.abs(A-B);
        System.out.printf("%.1f", 1d*sum/2);
    }
}
