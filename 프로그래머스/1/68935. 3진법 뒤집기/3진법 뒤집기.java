class Solution {
    public int solution(int n) {
        String three = Integer.toString(n, 3); // 3진법 변환
        String reversed = new StringBuilder(three).reverse().toString(); // 문자열 반전
        int result = Integer.parseInt(reversed, 3); // 다시 10진수 변환
        return result;
    }
}