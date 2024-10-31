import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d); // 정렬

        for (int i = 0; i < d.length; i++) {
            if (d[i] <= budget) {
                budget -= d[i]; // 예산에서 빼기
            } else { // 예산이 부족해졌을 시
                answer = i; // 지원해준 부서 수 저장
                break;
            }
            answer = d.length; // 모든 부서를 지원해준 경우 - d의 길이
        }
        return answer;
    }
}