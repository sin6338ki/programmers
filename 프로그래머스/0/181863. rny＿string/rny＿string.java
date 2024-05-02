class Solution {
    public String solution(String rny_string) {
        String answer = "";
        if(rny_string.contains("m")){
            answer = rny_string.replace("m", "rn");
        }else{
            answer = rny_string;
        }
        return answer;
    }
}