class Solution {
    public int solution(int[] num_list) {
        int answer = num_list.length >= 11 ? 0 : 1;
        
        if(num_list.length >= 11){
            for(int i : num_list){
                answer += i;
            }
        }else{
            for(int i : num_list){
                answer *= i;
            }
        }
        return answer;
    }
    
}