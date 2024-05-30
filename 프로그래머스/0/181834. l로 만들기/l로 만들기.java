class Solution {
    public String solution(String myString) {
        String answer = "";
        char[] strArray = myString.toCharArray();
        
        for(int i = 0 ; i < myString.length() ; i++){
            if(strArray[i] < 'l'){
                answer += "l";
            }else{
                answer += String.valueOf(strArray[i]);
            }
        }
        
        return answer;
    }
}