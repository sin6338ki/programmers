class Solution {
    public int solution(String myString, String pat) {
        String newString = "";
        for(String str : myString.split("")){
            newString += str.equals("A") ? "B" : "A";
        }
        
        if(newString.contains(pat)){
            return 1;
        }
        
        return 0;
    }
}