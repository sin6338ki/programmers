class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int max = Math.max(n, m);
        int min = Math.min(n, m);
        
        int divisor = 1;
        int multiple = 1; 
        
        for(int i = 1; i <= min ; i++){
            if(max % i == 0 && min % i == 0){
                multiple = i;
            }
        }
        
        divisor = multiple * max / multiple * min / multiple;
        
        answer[0] = multiple;
        answer[1] = divisor;
        return answer;
    }
}