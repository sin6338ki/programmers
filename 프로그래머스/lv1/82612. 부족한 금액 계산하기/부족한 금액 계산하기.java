class Solution {
    public long solution(int price, long money, int count) {
        long answer = -1;
        long total = 0;
        
        for(int i = 1 ; i <= count ; i++){
            total +=  price * i;
        }
        
        answer = total - money;
        
        if(answer < 0){
            answer = 0;
        }else{
            answer = total - money;
        }
        
        return answer;
    }
}