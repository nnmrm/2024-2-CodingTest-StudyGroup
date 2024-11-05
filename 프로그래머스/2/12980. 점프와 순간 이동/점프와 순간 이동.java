public class Solution {
    public int solution(int n) {
        int ans = 0;

        while (n > 0) {
            if (n % 2 == 1) { // 홀수면 1칸 뒤로, 비용은 +1
                n--;
                ans++;
            } else if (n % 2 == 0) { // 짝수면 2 나누기, 비용은 0
                n /= 2;
            }
        }
        return ans;
    }
}