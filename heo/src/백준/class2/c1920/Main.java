package 백준.class2.c1920;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] nValue = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            nValue[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nValue);

        int M = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < M; i++) {
            int mValue = Integer.parseInt(st.nextToken());
            int in = Arrays.binarySearch(nValue, mValue);

            if (in < 0) {
                sb.append(0 + "\n");
            } else {
                sb.append(1 + "\n");
            }
        }
        System.out.println(sb);
    }
}
