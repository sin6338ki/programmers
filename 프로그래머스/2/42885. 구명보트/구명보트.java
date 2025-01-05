import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        //모든 사람을 구출하기 위해 필요한 구명보트의 개숫의 최솟값
        int answer = 0;
        Arrays.sort(people);
        
        int i = people.length - 1;
        int j = 0;
        while(i >= j){
            if(people[i] + people[j] <= limit){
                answer++;
                j++;
                i--;
            }else{
                answer++;
                i--;
            }
        }
        return answer;
    }
}