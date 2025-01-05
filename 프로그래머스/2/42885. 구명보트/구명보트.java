import java.util.Arrays;

/* 풀이
    1. 몸무게 배열을 오름차순으로 정렬한 후 
    2. 양 끝 몸무게의 합이 limit 보다 작거나 같은 경우 범위 좁히기 
*/
class Solution {
    public int solution(int[] people, int limit) {
        //모든 사람을 구출하기 위해 필요한 구명보트의 개숫의 최솟값
        int answer = 0;
        Arrays.sort(people); 
        
        int i = people.length - 1;
        int j = 0;
        while(i >= j){
            answer++;
            if(people[i] + people[j] <= limit){
                j++;   
            }
            i--;
        }
        return answer;
    }
}
