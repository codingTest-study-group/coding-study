package 백준.class1.c8958;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int input = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < input; i++) {
            int count = 0;
            int sum = 0;
            String ox = sc.nextLine();

            for (char value : ox.toCharArray()) {
                if (value == 'O') {
                    count++;
                    sum += count;
                } else {
                    count = 0;
                }
            }
            sb.append(sum).append('\n');
        }
        System.out.println(sb);
    }
}
