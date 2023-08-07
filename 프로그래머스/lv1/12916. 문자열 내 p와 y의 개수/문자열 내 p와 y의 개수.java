import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;

        String[] array = s.split("");
        
        long cntP = Arrays.stream(array).filter(c-> c.equals("p") || c.equals("P")).count();
        long cntY = Arrays.stream(array).filter(c->c.equals("y") || c.equals("Y")).count();
        
        if(cntP == cntY){
            answer = true;
        }else{
            answer = false;
        }
        return answer;
    }
}