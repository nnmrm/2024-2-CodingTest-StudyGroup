class Solution {
    public String solution(String s, String skip, int index) {

        String Alphabet = "abcdefghijklmnopqrstuvwxyz";

        // skip 모두 삭제
        for (int i = 0; i < skip.length(); i++) {
            Alphabet = Alphabet.replace(String.valueOf(skip.charAt(i)), "");
        }

        StringBuilder result = new StringBuilder();

        for (int j = 0; j < s.length(); j++) {

            int idx = Alphabet.indexOf(s.charAt(j)) + index; // 건너뛰기하여 변환한 알파벳

            if (idx > Alphabet.length() - 1){ // 'z'를 뛰어넘으면 처음으로 돌아가기
                idx = idx % Alphabet.length();
            }

            result.append(Alphabet.charAt(idx)); // 뛰어넘지 않으면 그대로 추가
        }
        return result.toString();
    }
}