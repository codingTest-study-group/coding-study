package 백준.class1.c11720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int sum = 0;

        for (byte var : br.readLine().getBytes()) {
            sum += (var - 48);
        }
        System.out.println(sum);
    }
}
