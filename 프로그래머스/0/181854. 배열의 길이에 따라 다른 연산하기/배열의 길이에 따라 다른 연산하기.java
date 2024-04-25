class Solution {
    public int[] solution(int[] arr, int n) {
        
        int arrSize = arr.length;

        for(int i = (arrSize % 2 == 0 ? 1 : 0) ; i < arrSize ; i += 2){
            arr[i] += n;
        }
        
        return arr;
    }
}