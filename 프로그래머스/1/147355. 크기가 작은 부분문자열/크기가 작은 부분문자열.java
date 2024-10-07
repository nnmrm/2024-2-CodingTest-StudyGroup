import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String t, String p) {

        Long num = 0L;
        List<Long> nums = new ArrayList<Long>();

        for(int i = 0; i < t.length()-p.length()+1; i++){
            num = Long.parseLong(t.substring(i,i+p.length()));
            if(num <= Long.parseLong(p)){
                nums.add(num);
            }
        }

        return nums.size();
    }
}