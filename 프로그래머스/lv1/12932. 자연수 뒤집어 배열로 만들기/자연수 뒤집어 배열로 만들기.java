import java.util.*;

class Solution {
    public int[] solution(long n) {
        
        String s = String.valueOf(n);
        int idx = s.length();
        
        int[] answer = new int[idx];
        
        for(int i = 0 ; i < idx ; i++){
            answer[i] = (int)(n % 10);
            n /= 10;
        }
        
        return answer;
    }
}