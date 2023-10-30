package 백준.class1.c2475;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            int uniqueNumber = sc.nextInt();
            sum += uniqueNumber * uniqueNumber;
        }
        int numberOfVerifiers = sum % 10;
        System.out.println(numberOfVerifiers);
    }
}
