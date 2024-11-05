import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        
        int num_test = answers.length;
        int[] student_score = {0, 0, 0}; // 수포자 1, 2, 3의 점수를 등록할 배열
        String[] mathPatterns = {"12345", "21232425", "3311224455"}; 

        // 각 수포자의 점수 계산
        for (int i = 0; i < num_test; i++) {
            for (int j = 0; j < 3; j++) {
                char currentChar = mathPatterns[j].charAt(i % mathPatterns[j].length());
                if (currentChar - '0' == answers[i]) { // 정수로 비교
                    student_score[j]++;
                }
            }
        }

        // 최고 점수 계산하여 max에 저장
        int maxCount = 0;
        for (int count : student_score) {
            if (count > maxCount) {
                maxCount = count;
            }
        }

        // 동적으로 추가해야 하므로 ArrayList
        ArrayList<Integer> maxindex = new ArrayList<>();
        for (int i = 0; i < student_score.length; i++) {
            if (student_score[i] == maxCount) {
                maxindex.add(i + 1);
            }
        }

        // ArrayList -> 배열
        int[] result = maxindex.stream().mapToInt(Integer::intValue).toArray();

        return result;
    }
}
