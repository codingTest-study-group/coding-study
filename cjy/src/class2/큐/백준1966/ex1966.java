package class2.큐.백준1966;
// 프린터 문제
// 각 문서들의 중요도가 있는데 특정 위치에 있는 문서가 몇 번째로 인쇄되는지 출력하라

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ex1966 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        StringBuilder result = new StringBuilder();
        while (N != 0) {
            int papers = sc.nextInt();
            int index = sc.nextInt();
            int currentIndex = index;
            int printCount = 0;
            LinkedList<Integer> nums = new LinkedList<>();
            for (int i = 0; i < papers; i++) {
                nums.add(sc.nextInt());
            } if (nums.size() == 1) {
                result.append("1\n");
                N--;
                continue;
            }
            while (currentIndex >= 0) {
                int currentNum = nums.poll();
                boolean printAvailability = true;
                for (int i = 0; i < nums.size(); i++) {
                    if (currentNum < nums.get(i)) {
                        nums.add(currentNum);
                        currentIndex--;
                        if (currentIndex < 0) {
                            currentIndex = nums.size() - 1;
                        }
                        printAvailability = false;
                        break;
                    }
                }
                if (printAvailability) {
                    currentIndex--;
                    printCount++;
                }
            }
            N--;
            result.append(printCount+"\n");
        }
        System.out.println(result);
    }
}