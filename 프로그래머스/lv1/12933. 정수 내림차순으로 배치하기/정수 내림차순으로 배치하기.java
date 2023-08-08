import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public long solution(long n) {
        long answer = 0;

        List<Long> list = new ArrayList<Long>();
        
        while(n>0) {
        	list.add(n%10);
        	n /= 10;
        }
       
       list = list.stream().sorted().collect(Collectors.toList());
     
       int mul = 1;
        for(long item : list) {
        	answer += item * mul;
        	mul *= 10;
        }
        
        return answer;
    }
}