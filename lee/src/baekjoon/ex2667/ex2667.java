package baekjoon.ex2667;

import java.io.*;
import java.util.*;

//DFS를 쓰는 문제
public class ex2667 {
    static int[][] map;
    static boolean[][] visit;
    static int dx[] = {0,0,-1,1}; //상 하 좌 우
    static int dy[] = {-1,1,0,0};
    static int count ,total=0;
    static int N,nowX,nowY;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N= Integer.parseInt(br.readLine());
        map = new int[N][N];
        visit = new boolean[N][N];
        List<Integer> results = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            for (int j = 0; j < N; j++) {
                map[i][j] = Character.getNumericValue(str.charAt(j));
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(visit[i][j]== false && map[i][j]==1){
                    count =0;
                    total++;
                    DFS(i,j);
                    results.add(count);
                }
            }
        }

        Collections.sort(results);
        System.out.println(total);
        for(int result : results){
            System.out.println(result);
        }
    }

    private static void DFS(int x, int y) {
        visit[x][y] = true;
        map[x][y] = total;
        count++;
        for (int i = 0; i < 4; i++) {
            nowX = dx[i]+x;
            nowY = dy[i]+y;
            if(check_nextstep() && visit[nowX][nowY]==false && map[nowX][nowY]==1){
                visit[nowX][nowY]=true;
                map[x][y] = total;
                DFS(nowX,nowY);
            }
        }
    }
    private static boolean check_nextstep(){
        return nowX >= 0 && nowY >= 0 && nowX < N && nowY < N;
    }
}
