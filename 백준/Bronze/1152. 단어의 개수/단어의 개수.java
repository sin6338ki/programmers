import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        String[] arr = input.split(" ");
        int count = 0;
        
        for(String word : arr){
            if(word != ""){
                count++;
            }
        }
        bw.write(count + "");        
        bw.flush();
    }
}