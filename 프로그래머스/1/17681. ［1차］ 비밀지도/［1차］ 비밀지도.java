class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {

        String[] answer = new String[n];

         for (int i = 0; i < n; i++) {

             // OR 연산
             int OrOperation = arr1[i] | arr2[i];

             // 이진수 변환
             String binaryNum = Integer.toBinaryString(OrOperation);

             // 자릿수 맞추기
             while (binaryNum.length() < n) { 
                 binaryNum = "0" + binaryNum;
             }

             answer[i] = binaryNum.replace('0', ' ').replace('1','#'); //  문자 변환 : 0 -> " ", 1 -> "#"

         }
        return answer;
    }
}