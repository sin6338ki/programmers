class Solution {
    public int solution(int[] number) {
        int answer = 0;
        
        for(int i = 0 ; i < number.length ; i++){
            for(int j = i + 1 ; j < number.length ; j++){
                for(int l = j + 1 ; l < number.length ; l++){
                    int sum = number[i] + number[j] + number[l];
                    if(sum == 0){
                        answer++;
                    }
                }
            }
        }
        
        return answer;
    }
}