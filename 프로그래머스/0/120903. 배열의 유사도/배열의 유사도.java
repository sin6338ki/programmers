import java.util.stream.Stream;
import java.util.Arrays;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        for(String s : s1){
            Stream<String> stream2 = Arrays.stream(s2);
            long result = stream2.filter(x -> x.equals(s)).count();
            if(result > 0) answer++;
        }
        
        return answer;
    }
}