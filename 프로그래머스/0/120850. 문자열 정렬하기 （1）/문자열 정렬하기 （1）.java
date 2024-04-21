import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        
        String[] strArr = my_string.replaceAll("[A-Z|a-z]", "").split("");
        return  Arrays.stream(strArr).sorted().mapToInt(Integer::parseInt).toArray();
    }
}