class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] numArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        
        for(int i = 0 ; i < numArr.length ; i++){
            if(s.contains(numArr[i])){
                s = s.replace(numArr[i], num[i]);
            }
        }
        
        answer = Integer.parseInt(s);
        
        return answer;
    }
}