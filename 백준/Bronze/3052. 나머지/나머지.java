import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] remains = new int[10];
        int idx = 1;

        for(int i = 1 ; i <= 10 ; i++){
            boolean isSame = false;
            int inputNum = Integer.parseInt(br.readLine());
            
            if(i == 1){
                remains[0] = inputNum % 42;
            }else{
                for(int j = 0 ; j < idx ; j++){
                    if(remains[j] == inputNum % 42){
                         isSame = true;   
                    }
                }
             if(!isSame){
                 remains[idx] = inputNum % 42;
                 idx++;
             }
            }
        }
        System.out.println(idx);
    }
}