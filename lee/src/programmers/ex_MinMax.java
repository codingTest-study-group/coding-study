package programmers;

public class ex_MinMax {
    public static void main(String[] args) {
        String s = "1 2 3 4";
        System.out.println(solution(s));
    }
    public static String solution(String s) {
        String[] arr = s.split(" ");
        int min =Integer.MAX_VALUE;
        int max =Integer.MIN_VALUE;
        for(int i=0; i< arr.length; i++){
            int num = Integer.parseInt(arr[i]);
            max = Math.max(num,max);
            min = Math.min(num,min);
        }
        String str = Integer.toString(min) + " " + Integer.toString(max);
        return str;
    }
}
