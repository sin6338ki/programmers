class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        int n = 0;
        int temp = x;
        
        while(temp > 0) {
        	n += temp % 10;
        	temp /= 10;
        }
        
        if(x % n == 0) {
        	answer = true;
        }else {
        	answer = false;
        }
        
        return answer;
    }
}