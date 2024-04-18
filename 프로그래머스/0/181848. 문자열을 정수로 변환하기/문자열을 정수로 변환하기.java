class Solution {
    public int solution(String n_str) {
        int answer = 0;
        for(char s : n_str.toCharArray()){
            answer += s - 48;
            answer *= 10;
        }
        return answer / 10;
    }
}