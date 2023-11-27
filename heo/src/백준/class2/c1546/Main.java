package 백준.class2.c1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int M = -1;
        double sum = 0.0;

        for (int i = 0; i < N; i++) {
            int score = Integer.parseInt(st.nextToken());

            if (score > M) {
                M = score;
            }

            sum += score;
        }

        System.out.println(((sum / M) * 100.0) / N);
    }
}
