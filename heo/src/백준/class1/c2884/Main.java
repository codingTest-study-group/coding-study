package 백준.class1.c2884;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] arr = input.split(" ");

        int h = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);

        if (m < 45) {
            h--;
            m = 60 - (45 - m);
            if (h < 0) {
                h = 23;
            }
            System.out.println(h + " " + m);
        } else {
            System.out.println(h + " " + (m - 45));
        }
    }
}
