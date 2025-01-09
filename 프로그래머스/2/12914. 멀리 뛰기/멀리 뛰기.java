class Solution {
/*
 문제 풀이 방법
 n = 1 -> (1칸)
 n = 2 -> (1칸, 1칸) / (2칸)
 n = 3 -> (1칸, 1칸, 1칸) / (2칸, 1칸) / (1칸, 2칸)
 n = 4 -> (1칸, 1칸, 1칸, 1칸) / (2칸, 1칸, 1칸) / (1칸, 2칸, 1칸) / (1칸, 1칸, 2칸) / (2칸, 2칸)
 =======> n 경우의 수 = n - 1 경우의 수 + n -2 경우의 수
 =======> 동적프로그래밍 dp[n] = dp[n-1] + dp[n-2]
*/

    public long solution(int n) {
        long answer = dp(n, 0, 1);
        return answer;
    }
    
    public long dp(int n, long a, long b){
        long sum = a + b;
        if(n <= 1){
            return sum % 1234567;
        }
        
        return dp(n - 1, b, sum % 1234567);
    }
}