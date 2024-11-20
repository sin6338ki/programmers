class Solution {
    public int solution(int n) {
        int answer = 1; //n 자신 자신은 항상 포함
        int start = 1;
        int end = start + 1;
        int sum = start;
        
        while(start < n){
            if(sum < n){
                sum += end;
                end++;
            }else if(sum == n){
                answer++;
                start++;
                end = start + 1;
                sum = start;
            }else{
                start++;
                end = start + 1;
                sum = start;
            }
        }
        return answer;
    }
}