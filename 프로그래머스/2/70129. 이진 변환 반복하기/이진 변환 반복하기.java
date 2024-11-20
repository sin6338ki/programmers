import java.lang.StringBuffer;

class Solution {
    public int[] solution(String s) {
        int countOfZero = 0; //제거된 0의 갯수
        int countOfConvert = 0; //이진변환 횟수
        int[] result = new int[2];
        
        while(!s.equals("1")){
            int initialLength = s.length();
            String deleteZeroStr = s.replace("0", "");
            System.out.println(deleteZeroStr);
            int c = deleteZeroStr.length();
            countOfZero += initialLength - c;
            s = convertBinary(c);
            countOfConvert++;
        }
        result[0] = countOfConvert;
        result[1] = countOfZero;
        return result;
    }
    
    private String convertBinary(int c){
         StringBuffer binary = new StringBuffer("");
        while(c > 0){
            binary.append(c % 2 + "");
            c /= 2;
        }
        // System.out.println("이진수로 변환한 String: " + binary);
        return binary.reverse().toString();
    }
    
}