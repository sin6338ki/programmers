class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String stringSum = String.valueOf(a) + String.valueOf(b);
        
        if(Integer.parseInt(stringSum) > 2*a*b){
            answer = Integer.parseInt(stringSum);
        }else{
            answer = 2*a*b;
        }
        
        return answer;
    }
}