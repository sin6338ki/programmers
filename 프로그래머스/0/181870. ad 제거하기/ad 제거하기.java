import java.util.Arrays;

class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        int idx = 0;
        
        for(String str : strArr){
            if(!str.contains("ad")){
                answer[idx++] = str;
            }
        }
        
        return Arrays.copyOf(answer, idx);
    }
}