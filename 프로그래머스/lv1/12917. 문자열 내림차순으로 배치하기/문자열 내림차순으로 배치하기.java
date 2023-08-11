import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        List<Integer> upper = s.chars().filter(item -> item <= 90).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        List<Integer> lower = s.chars().filter(item -> item > 90).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        for(int item : lower) {
        	answer += (char)item;
        }
        
        for(int item : upper) {
        	answer += (char)item;
        }
     
        return answer;
    }
}