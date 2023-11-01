package 백준.class1.c2739;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();

        for (int i = 1; i <= 9; i++) {
            int result = input * i;
            System.out.println(input + " * " + i + " = " + result);
        }
    }
}
