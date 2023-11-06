package 백준.class1.c10871;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int a = sc.nextInt();
        int x = sc.nextInt();

        for (int i = 0; i < a; i++) {
           int result = sc.nextInt();
           if (x > result) sb.append(result).append(' ');
        }
        System.out.println(sb);
    }
}
