package 백준.class1.c10250;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int test = sc.nextInt();

        for (int i = 0; i < test; i++) {
            int H = sc.nextInt();
            sc.nextInt();
            int N = sc.nextInt();

            if (N % H == 0) {
                sb.append((H * 100) + (N / H)).append('\n');
            } else {
                sb.append(((N % H) * 100) + (N / H) + 1).append('\n');
            }
        }
        System.out.println(sb);
    }
}
