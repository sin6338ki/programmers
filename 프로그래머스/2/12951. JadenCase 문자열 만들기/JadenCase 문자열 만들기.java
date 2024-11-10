import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public String solution(String s) {
        String answer = ""; //정답
        
        char[] charArray = s.toLowerCase().toCharArray(); //모든 문자열로 소문자로 변경
        Queue<Character> myQueue = new LinkedList<>(); //문자열을 큐에 저장
        for(char c : charArray){
            myQueue.add(c);
        }
        
        //맨 처음이 공백이라면 poll()
        if(myQueue.peek() == ' '){
            answer += myQueue.poll();
        }
        
        //큐에 저장된 첫번째 값 소문자인 경우 대문자로 변경
        if(myQueue.peek() > 96){
            answer += (char)(myQueue.poll() - 32);
        }else{
            answer += myQueue.poll();
        }
        
        //큐가 빌 때까지 반복
        while(!myQueue.isEmpty()){
            if(myQueue.peek() == ' '){
                answer += myQueue.poll();
                if(!myQueue.isEmpty() && myQueue.peek() > 96){
                    answer += (char)(myQueue.poll() - 32);
                }
            }else{
                answer += myQueue.poll();
            }
        }
        return answer;
    }
}