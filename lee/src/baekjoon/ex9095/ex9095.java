package baekjoon.ex9095;

import java.util.Scanner;
//DP문제
public class ex9095 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int N = sc.nextInt();

        int arr[] = new int[11];
        arr[0]=0;
        arr[1]=1;
        arr[2]=2;
        arr[3]=4;

        for (int i = 4; i < 11; i++) {
            arr[i] = arr[i-1]+ arr[i-2] + arr[i-3];
        }
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            System.out.println(arr[num]);
        }
    }
}
