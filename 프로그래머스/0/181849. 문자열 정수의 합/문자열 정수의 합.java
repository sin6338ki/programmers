class Solution {
    public int solution(String num_str) {
        return num_str.chars().map(s -> s - 48).sum();
    }
}