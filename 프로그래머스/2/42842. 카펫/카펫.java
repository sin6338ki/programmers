class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int num1 = 0;
        int num2 = 0;
        int sum = brown + yellow;
        
        for(int i = 1 ; i < brown ; i++){    
            if(sum % i == 0){
                 if(i >= sum / i){
                     num1 = i;
                     num2 = sum / i;
                 }
                
                if((num1 - 2) * (num2 - 2) == yellow){
                    answer[0] = num1;
                    answer[1] = num2;
                }
            }
        }
        return answer;
    }
}