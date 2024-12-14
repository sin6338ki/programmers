import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        Stack<Character> sStack = new Stack<>();
        char[] sChar = s.toCharArray();
        
        sStack.push(sChar[0]);
        for(int i=1 ; i<sChar.length ; i++){
            
            if(!sStack.empty() && sStack.peek() == sChar[i]){
                sStack.pop();
            }else{
                sStack.push(sChar[i]);
            }

        }
        
        if(sStack.empty()) answer = 1;

        return answer;
    }
}