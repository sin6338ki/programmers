import java.util.* ;

class Solution {
    public Integer[] solution(int[] numbers) {
        int size = 1;
       
        for(int k = 1 ; k <= numbers.length ; k++){
            size *= k;
        }
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        int idx = 0;
        for(int i = 0 ; i < numbers.length ; i++){
            for(int j = i + 1 ; j < numbers.length ; j++){
                int sum = numbers[i] + numbers[j];
            
                if(!arr.contains(sum)) {
                	arr.add(sum);
                };
            }
        }
        arr.sort(Comparator.naturalOrder());
        Integer[] answer = arr.toArray(new Integer[arr.size()]);
        
       
        return answer;
    }

}