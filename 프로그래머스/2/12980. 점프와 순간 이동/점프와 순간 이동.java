import java.util.*;

/**
* 문제분석
* 기능1) K칸 앞으로 점프 => K만큼 건전지 사용
* 기능2) (현재까지 온 거리)*2 순간이동
* 최소 점프로 거리 N에 도달하기 위해 사용해야 하는 건전지 사용량 구하기
*
* 풀이
* N을 2로 나눈 몫이 1이 될 때까지 나눈다. (while)
* N을 2로 나누었을 때 나머지가 1의 횟수 + 1(맨 처음 한발자국)
*/
public class Solution {
    public int solution(int n) {
        int ans = 1;
        while(n / 2 >= 1){
            if(n % 2 == 1){
                ans++;
            }
            n /= 2;
        }
        return ans;
    }
}