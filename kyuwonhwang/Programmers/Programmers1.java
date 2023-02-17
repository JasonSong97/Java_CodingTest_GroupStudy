package kyuwonhwang;

import java.util.*;

class Programmers1 {
    public static void main(String[] args) {
        System.out.println(solution(5, new int[] { 2, 4 }, new int[] { 1, 3, 5 }));
        System.out.println(solution(5, new int[] { 2, 4 }, new int[] { 3 }));
        System.out.println(solution(3, new int[] { 3 }, new int[] { 1 }));
        System.out.println(solution(3, new int[] { 2, 1 }, new int[] { 3,2 }));
    }

    public static int solution(int n, int[] lost, int[] reserve){
        int answer = n - lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        //여벌 체육복이 있는 학생이 도난당한 경우
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) { //자기 자신이 포함되어 있으면
                    lost[i] = -1;
                    reserve[j] = -1;
                    answer++; //인원수 추가
                    break;
                    }
                }
            }
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                //잃어버린 사람 앞 뒤 번호만 빌릴 수 있으므로
                if (lost[i] == reserve[j] + 1 || lost[i] == reserve[j] - 1) {
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        return answer;
    }
}