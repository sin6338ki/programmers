import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<Integer>();
        
        for(int i : arr){
            for(int j=0; j<i ; j++){
                answer.add(i);    
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}