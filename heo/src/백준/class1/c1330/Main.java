package 백준.class1.c1330;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        String result;

        switch (Integer.signum(a - b)) {
            case 1:
                result = ">";
                break;
            case -1:
                result = "<";
                break;
            default:
                result = "==";
                break;
        }

        System.out.println(result);
    }
}
