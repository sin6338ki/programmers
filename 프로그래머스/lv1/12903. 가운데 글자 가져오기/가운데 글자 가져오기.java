class Solution {
    public String solution(String s) {
        String answer = "";
        int middleIdx = s.length() / 2 ;
        
        if(s.length() % 2 == 0){
            answer = s.substring(middleIdx-1, middleIdx+1);
        }else{
            answer =s.substring(middleIdx, middleIdx+1);
        }
        return answer;
    }
}