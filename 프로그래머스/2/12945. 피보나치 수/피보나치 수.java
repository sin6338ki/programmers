import java.util.Arrays;

class Solution {
    public int solution(int n) {
        //재귀함수만 사용할 경우 시간초과 발생
        //따라서 배열을 선언하고 해당 배열에 피보나치수를 저장하여 값 가져다 쓰기
        int fibo[] = new int[n+1];
        for(int i=0 ; i<n+1 ; i++){
            if(i == 0){
                fibo[i] = 0;
            }else if(i == 1){
                fibo[i] = 1;
            }else{
                fibo[i] = (fibo[i-2] + fibo[i-1]) % 1234567;
            }
        }        
        return fibo[n];
    }

}