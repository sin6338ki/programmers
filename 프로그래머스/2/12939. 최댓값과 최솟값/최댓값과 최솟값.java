import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] arr = s.split(" ");
        long min = Long.parseLong(arr[0]);
        long max = Long.parseLong(arr[0]);
        
        for(int i = 0 ; i < arr.length ; i++){
            if(Long.parseLong(arr[i]) < min){
                min = Long.parseLong(arr[i]);
            }else if(Long.parseLong(arr[i]) > max){
                max = Long.parseLong(arr[i]);
            }
        }
        
        return min + " " + max;
    }
}