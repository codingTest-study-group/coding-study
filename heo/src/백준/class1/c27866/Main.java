package 백준.class1.c27866;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine().trim();
        int i = Integer.parseInt(br.readLine());

        System.out.println(S.charAt(i - 1));
    }
}
