class Solution {
    public int solution(int n) {
        int answer = 0;
        String num = "";
        int idx = 0;
        
        while(n > 0){
            num += n % 3 + "" ;
            idx++;
            n /= 3;
        }
        
        String[] arr = num.split("");
        int mul = 1; 
        
        for(int i = arr.length - 1 ; i >= 0; i--){
            answer += Integer.parseInt(arr[i])*mul;
            mul *= 3;
        }
        return answer;
    }
}