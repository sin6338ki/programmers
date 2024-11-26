import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int[] array = new int[input.length()];
        // 입력 받은 문자열 배열로 변경
        for(int i = 0 ; i < input.length() ; i++){ 
            array[i] = Integer.parseInt(input.split("")[i]);
        }
        
        //선택정렬
        for(int i = 0 ; i < array.length ; i++){
            int MAX = 0;
            for(int j = i ; j < array.length ; j++){
                if(MAX < array[j]){
                    MAX = array[j]; //최댓값 변경
                    int temp = array[i];
                    array[i] = MAX; //맨 앞 값은 최댓값으로
                    array[j] = temp; //기존 최댓값 자리에 맨 앞에 있던 값 자리 변경
                }
            }
        }
        
        for(int i = 0 ; i < array.length ; i++){
            System.out.print(array[i]);
        }
        
    }
}