class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1 ; i <= n ; i++){
            if(n % i == 0){
                answer += i;
            }else{
                answer += 0;
            }
        }
        return answer;
    }
}