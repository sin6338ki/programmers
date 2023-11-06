import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        int[] output = new int[26];
        Arrays.fill(output, -1);
        
        for(int i = 0 ; i < input.length() ; i++){
            boolean isSame = false;
            char search = input.charAt(i);
            
            if(i > 0){
                for(int k = 0 ; k < i; k++){
                    if(search == input.charAt(k)){
                        isSame = true;
                    } 
                }
            }
            
            if(!isSame){
                output[(int)search - 97] = i;
            }
        }

        for(int j = 0 ; j < 26 ; j++){
            bw.write(output[j] + " ");
        }
        bw.flush();
    }
}