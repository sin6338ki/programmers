class Solution {
    int maxLen, left;
    
    public String longestPalindrome(String s) {
        
        int len = s.length();
        
        if(len < 2) return s;
        
        for(int i=0 ; i < len ; i++){
            extendPalindrome(s, i, i+1);
            extendPalindrome(s, i, i+2);
        }
        return s.substring(left, left+maxLen);
        
    }
    
    public void extendPalindrome(String s, int j, int k){
        while(j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)){
            k++;
            j--;
        }
        
        if(maxLen < k - j - 1){
            maxLen = k - j - 1;
            left = j + 1;
        }
    }
    
    
}