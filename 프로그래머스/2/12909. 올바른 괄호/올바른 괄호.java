import java.util.Stack;

class Solution {
    boolean solution(String s) {
        char[] sArr = s.toCharArray();
        Stack<Integer> myStack = new Stack<>();
        if(sArr[0] == ')'){
            return false;           
        }
        
        myStack.push(1);
        for(int i=1 ; i < sArr.length ; i++){
            if(!myStack.isEmpty() && sArr[i] == ')'){
                myStack.pop();
            }else{
                myStack.push(1);
            }
        }
        
        if(myStack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}