import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < delete_list.length ; j++){
                if(arr[i] == delete_list[j]){
                    arr[i] = 0;
                }
            }
        }
        
    return IntStream.of(arr).filter(i -> i != 0).toArray();
    }
}