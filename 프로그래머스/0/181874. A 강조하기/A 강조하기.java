class Solution {
    public String solution(String myString) {  
        String answer = myString.toLowerCase();
        return answer.contains("a") ? answer.replace("a", "A") : answer;
    }
}