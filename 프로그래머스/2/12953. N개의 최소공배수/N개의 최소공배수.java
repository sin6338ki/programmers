import java.util.Arrays;
 
class Solution {
    public int solution(int[] arr) {
        // arr을 오름차순으로 정렬한 후 두 수의 최소공배수 구하기
        Arrays.sort(arr); //오름차순 정렬
        
        //첫번째 최소공배수
        int num = lcm(arr[1], arr[0]);
        
        for(int i = 2 ; i < arr.length ; i++){
            if(num > arr[i]){
                num = lcm(num, arr[i]);
            }else{
                num = lcm(arr[i], num);
            }
            
        }
        return num;
    }
    //유클리드 알고리즘: 두 수의 최대공약수를 구하는 알고리즘
    //원리: a % b => 나머지 r이 0이 될 때의 나눈수 X 몫
    public int gcd(int a, int b){
        int r = 0;
        while(b != 0){
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    
    //최소공배수 구하기
    public int lcm(int a, int b){
        return (a * b) / gcd(a, b);
    } 
}