import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int size = num_list.length;
        int[] answer = Arrays.copyOf(num_list, size+1);
        
        if(num_list[size-2] < num_list[size-1]){
            answer[answer.length-1] = num_list[size-1] - num_list[size-2];
        }else{
            answer[answer.length-1] = num_list[size-1]*2;
        }
        
        return answer;
    }
}