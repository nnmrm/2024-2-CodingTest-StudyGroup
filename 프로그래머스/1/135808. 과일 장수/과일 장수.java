import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int p = score.length - m;
        Arrays.sort(score);
        while(p >= 0){
            answer += score[p] * m;
            p -= m;
        }
        return answer;
    }
}