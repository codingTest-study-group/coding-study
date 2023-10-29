package class2.수학.백준2108;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

// 통계학
// 주어진 N개의 수들로 산술 평균값, 중앙값, 최빈값, 범위를 구하여라
// 첫째줄에는 N이 두번째줄부터 N개의 수들이 나열된다. (단, N은 홀수이다)
// 소수점 첫번째자리를 반올림하여라
public class ex2108 {
    static int arithmeticMean;
    static int median;
    static int mode;
    static int range;
    static int sum;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
            sum += nums[i];
            if (hash.containsKey(nums[i])) {
                hash.put(nums[i], hash.get(nums[i]) + 1);
            } else {
                hash.put(nums[i], 0);
            }
        }
        Arrays.sort(nums);
        int modeA = 10000;
        int modeB = 10000;
        int maxCount = -1;
        for (Integer key : hash.keySet()) {
            if (maxCount < hash.get(key)) {
                maxCount = hash.get(key);
                modeA = key;
                modeB = 10000;
            } else if (maxCount == hash.get(key)) {
                if (modeA > key) {
                    modeB = Math.min(modeA, modeB);
                    modeA = key;
                } else {
                    modeB = Math.min(modeB, key);
                }
            }
        }
        arithmeticMean = (int) Math.round((double) sum / nums.length);
        median = nums[nums.length / 2];
        if (modeB != 10000) {
            mode = modeB;
        } else {
            mode = modeA;
        }
        range = nums[nums.length - 1] - nums[0];
        System.out.printf(arithmeticMean + "\n" + median + "\n" + mode + "\n" + range);
    }
}