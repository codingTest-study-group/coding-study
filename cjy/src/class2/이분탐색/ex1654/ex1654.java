package class2.이분탐색.ex1654;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

// K 개의 랜선을 가지고 있다. 랜선의 길이는 제각각이다.
// 랜선을 모두 N개의 길이의 랜선으로 만들고 싶다. 그렇기 때문에 K개의 랜선을 잘라서 만들어야 한다.
// N개와 같거나 그 이상으로 만들 수 있는 길이 중 최대 길이를 구하자
public class ex1654 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();

        int[] nums = new int[K];
        for (int i = 0; i < K; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.parallelSort(nums);
        long max = nums[K-1];
        long min = 1;
        long len = (max + min) / 2;

        while(min <= max) {
            long count = 0;
            for (int i = 0; i < K; i++) {
                count += nums[i] / len;
            }
            if (count < N) {
                max = len - 1;
            }
            else if (count >= N) {
                min = len + 1;
            }
            len = (max + min) / 2;
        }
        System.out.println(len);
    }
}