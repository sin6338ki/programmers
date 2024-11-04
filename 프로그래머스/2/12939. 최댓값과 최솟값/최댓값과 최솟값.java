import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] arr = s.split(" ");
        long min = Integer.parseInt(arr[0]);
        long max = Integer.parseInt(arr[0]);
        
        for(int i = 0 ; i < arr.length ; i++){
            if(Integer.parseInt(arr[i]) < min){
                min = Integer.parseInt(arr[i]);
            }else if(Integer.parseInt(arr[i]) > max){
                max = Integer.parseInt(arr[i]);
            }
        }
        
        return min + " " + max;
    }
}