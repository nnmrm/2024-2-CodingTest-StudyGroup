import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            if (d[i] <= budget) {
                budget -= d[i];
            }
            else {
                answer = i;
                break;
            }
            answer = i+1;
        }
        return answer;
    }
}