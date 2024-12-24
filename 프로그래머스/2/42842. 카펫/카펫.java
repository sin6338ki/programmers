class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int width = 0;
        int height = 0;
        int sum = brown + yellow;
        
        for(int i = 1 ; i < brown ; i++){    
            if(sum % i == 0 && i >= sum / i){        
                width = i;
                height = sum / i;
                 
                if((width - 2) * (height - 2) == yellow){
                    answer[0] = width;
                    answer[1] = height;
                }
            }
        }
        return answer;
    }
}