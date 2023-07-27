import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        answer = (int)Arrays.stream(array).filter(x -> x==n).count();
        return answer;
    }
}