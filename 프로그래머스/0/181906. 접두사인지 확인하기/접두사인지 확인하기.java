class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        
        if(my_string.contains(is_prefix)){
            my_string = my_string.substring(0, is_prefix.length());
            if(my_string.equals(is_prefix)){
                answer = 1;
            }
        }
        
        return answer;
    }
}