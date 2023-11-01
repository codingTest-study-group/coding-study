package 백준.class1.c2675;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < t; i++) {
            String[] str = sc.nextLine().split(" ");
            int r = Integer.parseInt(str[0]);
            for (byte val : str[1].getBytes()) {
                sb.append(String.valueOf((char) val).repeat(Math.max(0, r)));
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
