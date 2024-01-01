package 백준.class2.c15829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static final int M = 1234567891;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        String alphabet = br.readLine();
        long sum = 0;
        long pow = 1;
        char[] arr = alphabet.toCharArray();

        for (int i = 0; i < L; i++) {
            sum+= ((arr[i] - 96) * pow);
            pow=(pow * 31) % M;
        }
        long result = sum % M;
        System.out.println(result);
    }
}
