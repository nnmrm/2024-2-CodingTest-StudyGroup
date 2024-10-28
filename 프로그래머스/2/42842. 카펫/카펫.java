class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};

        int height = 0; // 노란색 세로 격자 수

        // 갈색 격자 수 = 2*(노란색 가로 + 세로) + 4
        int candidates = (brown - 4) / 2;

        for (int i = candidates; i > 0 ; i++) {
            candidates--; // 가로 -1
            height++; // 세로 +1
            if (candidates * height == yellow) { // 곱해서 해당하는 경우를 찾으면 카펫 크기 저장
                answer = new int[]{candidates + 2, height + 2};
                break;
            }
        }
        return answer;
    }
}