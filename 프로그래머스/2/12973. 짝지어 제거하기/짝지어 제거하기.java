import java.util.Stack; // 질문 게시판 보고 힌트 얻음ㅎㅎ

class Solution {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                // 스택에 숫자 존재 + 현재 넣으려는 수와 스택 맨 위의 수가 동일
                stack.pop();
            } else {
                // 짝이 아니므로 스택에 추가
                stack.push(c);
            }
        }

        // 스택이 비어있으면 모든 문자가 제거된 상태 -> 1
        return stack.isEmpty() ? 1 : 0;
    }
}