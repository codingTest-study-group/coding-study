package baekjoon.ex1966;
import java.util.*;
public class ex1966 {
    //참고 : https://st-lab.tistory.com/201
    public static void main(String[] args) {
        //큐를 이용해 중요도 낮으면 맨뒤로 보내는 형식
        //Num : 테스트 케이스 갯수
        //N : 문서의 갯수
        //M : 몇번째로 인쇄되는지 궁금한 문서가 순서
        //각각 문서 중요도 : 1 1 9 1 1 1
        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < Num; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            LinkedList<int[]> queue = new LinkedList<>();

            for (int j = 0; j < N; j++) {

                queue.offer(new int[]{j,sc.nextInt()});//[0] : 초기 위치, [1] : 중요도
            }
            int count =0;

            while(!queue.isEmpty()){//한 테스트 케이스 에 대한 비교
                int[] front = queue.poll();//첫 원소
                boolean isMax = true;//가장 큰 원소인지 여부(front)
                // 큐에 남아있는 원소들과 중요도를 비교

                for (int j = 0; j < queue.size(); j++) {
                    //처음 뽑은 원소가 j번째 원소보다 중요도가 클경우
                    if(front[1] < queue.get(j)[1]){
                        //front랑 j번째 원소 까지 원소들을 맨뒤로 순서대로 보낸다.
                        queue.offer(front);
                        for (int k = 0; k < j; k++) {
                            queue.offer(queue.poll());
                        }
                        isMax=false;//여부를 false로 바꾼 후 break
                        break;
                    }
                }

                if (isMax==false){//가장 중요한 문서가 아니므로 다시 돌리기.
                    continue;
                }

                count++;//가장 큰 원소이기에 count++
                if(front[0] ==M){//찾는 원소이면 종료
                    break;
                }
            }
            sb.append(count).append('\n');
        }
        System.out.println(sb);
    }
}
