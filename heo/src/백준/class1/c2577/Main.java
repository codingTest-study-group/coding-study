package 백준.class1.c2577;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int val = sc.nextInt() * sc.nextInt() * sc.nextInt();
        String str = String.valueOf(val);

        for (int i = 0; i < str.length(); i++) {
            arr[(str.charAt(i) - '0')] ++;
        }

        for (int v : arr) {
            System.out.println(v);
        }
    }
}
