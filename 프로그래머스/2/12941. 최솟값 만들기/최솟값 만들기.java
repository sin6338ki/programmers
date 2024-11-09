import java.util.Arrays;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
    
        //풀이방식: 배열을 오름차순으로 정렬하여 A의 최소값과 B의 최댓값의 곱을 구하여
        //          작은값을 큰수와 곱해 최솟값으로 만들기
        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int i=0 ; i<A.length; i++){
            answer += A[i] * B[A.length - i - 1];
        }
        return answer;
    }
}