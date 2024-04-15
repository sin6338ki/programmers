import java.util.stream.*;

class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        String[] cipherArr = cipher.split("");
        for(int i = 1 ; i <= cipherArr.length ; i++){
            if(i%code == 0){
                answer += cipherArr[i-1];
            }
        }
        return answer;
    }
}