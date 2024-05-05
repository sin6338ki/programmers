class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        if(num_list.length >= 11){
            answer = sum(num_list);
        }else{
            answer = multi(num_list);
        }
        return answer;
    }
    
    public int sum(int[] num_list){
        int sum = 0;
        for(int i : num_list){
            sum += i;
        }
        return sum;
    }
    
    public int multi(int[] num_list){
        int sum = 1;
        for(int i : num_list){
            sum *= i;
        }
        return sum;
    }
}