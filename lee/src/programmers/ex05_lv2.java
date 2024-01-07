package programmers;
import java.util.*;
public class ex05_lv2 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/70129
    //이진 변환 반복하기
    public static void main(String[] args) {
        String s1 = "111";
        System.out.println(solution(s1));
        String s2 = "1111111";
        System.out.println(solution(s2));
        String s3 = "11";
        System.out.println(solution(s3));
        String s4 = "10";
        System.out.println(solution(s4));
    }
    public static int[] solution(String s) {
        int[] answer = new int[2];
        int count =0;
        int zcnt=0;
        int len=0;
        while(!s.equals("1")){

            len=0;
            for(int i=0; i<s.length();i++){
                if(s.charAt(i) =='0'){
                    zcnt++;
                }
                else{
                    len++;
                }
            }
            s = Integer.toBinaryString(len);
            count++;
        }
        answer[0] = count;
        answer[1] = zcnt;
        return answer;
    }
}
