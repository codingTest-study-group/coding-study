package 백준.class1.c1152;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String st = sc.nextLine().trim();
        sc.close();

        if (st.isEmpty()) System.out.println('0');
        else System.out.println(st.split(" ").length);
    }
}
