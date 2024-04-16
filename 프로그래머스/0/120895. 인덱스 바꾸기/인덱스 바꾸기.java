class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] stringArr = my_string.split("");
        for(int i = 0 ; i < my_string.length() ; i++){
            if(i == num1){
                answer += stringArr[num2];
            }else if(i == num2){
                answer += stringArr[num1];
            }else{
                answer += stringArr[i];
            }
        }
        return answer;
    }
}