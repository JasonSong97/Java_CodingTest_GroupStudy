package kyuwonhwang;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjun1 {

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("사람 수를 입력하세요 :");
            int n = sc.nextInt(); //사람 수
            int[] arr = new int[n]; //사람 수 크기의 인출에 걸리는 시간 배열

            int waitTime = 0;
            int totalTime = 0;

            System.out.println("각 사람마다 인출에 걸리는 시간(분)을 입력하세요 :");
            for (int i = 0; i < n; i++) { //반복문 돌면서 인출시간 배열 입력
                arr[i] = sc.nextInt();
            }
            // 시간 적게 걸리는 사람 순으로 정렬
            Arrays.sort(arr);

            for (int i = 0; i < n; i++) {
                // 각각 기다린 시간 + 모두가 인출하는데 걸리는 시간
                waitTime += arr[i];
                totalTime += waitTime;
            }
            System.out.println("결과: "+totalTime);
        }
    }