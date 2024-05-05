class Solution {
    public String solution(String myString) {
        String newString = myString;
        String answer = "";
            
        for(char c : myString.toCharArray()){
            if(c < 97){
                newString = myString.toLowerCase();
            }
        }
        
        return newString.contains("a") ? newString.replace("a", "A") : newString;
    }
}