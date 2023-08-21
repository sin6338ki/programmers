class Solution {
    public String solution(String s) {
        String answer = "";

        char[] arr = s.toCharArray();
        
        
        int idx = 0;
        for(int i = 0 ; i < arr.length ; i++) {
        	if(arr[i] != 32) {
        		if(idx % 2 == 0) {
        			answer += String.valueOf(arr[i]).toUpperCase();
        		}
        		else {
        			answer += String.valueOf(arr[i]).toLowerCase();
        		}
        		idx++;
        	}else {
        		idx=0;
        		answer += " ";
        	}
        }
        
        return answer;
    }
}