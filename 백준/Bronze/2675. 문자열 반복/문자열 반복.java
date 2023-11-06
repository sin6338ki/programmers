import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0 ; i < T ; i++){
            String input = br.readLine();
            int num = Integer.parseInt(input.split(" ")[0]);
            String words = input.split(" ")[1];
            
            for(int j = 0 ; j < words.length(); j++){
                for(int k = 1 ; k <= num ; k++){
                    bw.write(words.charAt(j)+"");
                }
            }
            bw.write("\n");
        }
        bw.flush();
    }
}