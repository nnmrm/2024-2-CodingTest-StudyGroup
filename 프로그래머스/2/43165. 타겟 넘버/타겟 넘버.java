class Solution {

    private int target;
    private int count;

    public int solution(int[] numbers, int target) {
        this.target = target; // 타겟값은 전역으로 설정
        count(numbers, 0, 0);
        return count;
    }

    public void count(int[] numbers, int index, int sum) {

        if (index == numbers.length) { // 배열 끝에 다다름
            if (sum == target) { // 타겟값 만족 -> count + 1
                count++;
            }
        }
        
        // 더하거나 빼는 각각의 케이스에 대한 재귀 호출 - target을 만족하는 경우의 수를 구함
        if (index < numbers.length) {

            int plus = sum + numbers[index]; // 해당 위치의 원소를 더하는 경우
            int minus = sum - numbers[index]; // 해당 위치의 원소를 빼는 경우
            
            count(numbers, index + 1, plus); 
            count(numbers, index + 1, minus);
        }
    }
}