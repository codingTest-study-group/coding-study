package baekjoon.ex7568;

import java.util.Scanner;

public class ex7568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [][] arr = new int[N][2];
        int [] result = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            int rank = 1;
            for (int j = 0; j < N; j++) {
                if(arr[j][0]>arr[i][0] && arr[j][1]>arr[i][1]){
                    rank++;
                }
            }
            result[i] = rank;
        }
        for (int i = 0; i < N; i++) {
            if(i==N-1){
                System.out.print(result[i]);
                break;
            }
            else{
                System.out.print(result[i]+" ");
            }
        }
    }
}
