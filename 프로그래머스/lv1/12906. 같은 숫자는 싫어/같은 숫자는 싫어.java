import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int idx = 1;
        int[] answer = new int[arr.length];
        
        answer[0] = arr[0];
        
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] != arr[i-1]){
                answer[idx] = arr[i];
                idx++;
            }
        }
        int[] copy = Arrays.copyOf(answer, idx);
        return copy;
    }
}