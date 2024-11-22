class Solution {
    public int solution(int n) {
        int answer = n;
        while(true){
            answer++;
            if(countOne(n) == countOne(answer)){
                break;
            }
        }
        return answer;
    }
    
    private int countOne(int n){
        int count = 0;
        while(n > 0){
            if(n%2 == 1){
                count++;
            }
            n /= 2;
        }
        return count++;
    }
}