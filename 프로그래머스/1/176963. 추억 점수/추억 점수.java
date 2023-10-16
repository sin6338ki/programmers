class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        int idx = 0;
        for(String[] names:photo) {
            int sum = 0;
            for(String n:names){
                for(int i = 0 ; i < name.length ; i++){
                    if(n.equals(name[i])){
                      sum += yearning[i];  
                    }
                }
            }
            answer[idx] = sum;
            idx++;
        }
        return answer;
    }
}