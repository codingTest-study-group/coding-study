package 백준.class1.c10950;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int input = sc.nextInt();

        for (int i = 0; i < input; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sb.append(a + b).append('\n');
        }
        System.out.println(sb);
    }
}
