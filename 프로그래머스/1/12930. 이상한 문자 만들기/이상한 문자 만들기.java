
class Solution {
    public String solution(String s) {

        String[] words = s.split(" ",-1);
        String[][] chars = new String[words.length][];
        for (int i = 0; i < words.length; i++) {
            chars[i] = words[i].split("");
            for (int j = 0; j < words[i].length(); j++) {
                chars[i][j] = chars[i][j].toLowerCase();
                if (j % 2 == 0){
                    chars[i][j] = chars[i][j].toUpperCase();
                }
            }
            words[i] = String.join("",chars[i]);
        }
        return String.join(" ",words);
    }
}