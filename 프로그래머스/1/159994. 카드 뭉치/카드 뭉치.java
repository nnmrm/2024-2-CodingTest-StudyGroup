class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {

        int count_1 = 0;
        int count_2 = 0;

        for(int i = 0; i < goal.length; i++){
            if(count_1 < cards1.length && goal[i].equals(cards1[count_1])){
                count_1++;
            }
            else if(count_2 < cards2.length && goal[i].equals(cards2[count_2])){
                count_2++;
            }
            else return "No";
        }
        return "Yes";
    }
}