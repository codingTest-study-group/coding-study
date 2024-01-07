package programmers;
import java.util.*;
public class ex04_lv2 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/12909
    //올바른 괄호
    public static void main(String[] args) {
        String s = "()()";
        System.out.println(solution(s));
        String s1 = "(())()";
        System.out.println(solution(s1));
        String s2 = ")()(";
        System.out.println(solution(s2));
        String s3 = "(()(";
        System.out.println(solution(s3));

    }
        static boolean solution(String s) {
            boolean answer = true;
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') count++;
                else if (s.charAt(i) == ')' && count == 0) {
                    answer = false;
                    break;
                } else {
                    count--;
                }
            }
            if (count != 0) {
                answer = false;
            }
            return answer;
        }
}
