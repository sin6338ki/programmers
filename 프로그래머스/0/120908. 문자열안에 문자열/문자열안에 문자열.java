class Solution {
    public int solution(String str1, String str2) {
        //str1 안에 str2가 있다면 -> 1, 없다면 2
        int answer = 2;
        
        if(str1.contains(str2))  answer = 1;
        
        return answer;
    }
}