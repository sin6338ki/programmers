import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        String num1 = input.split(" ")[0];
        String num2 = input.split(" ")[1];
        
        //뒤집은 문자 
        String reversedNum1 = "" + num1.charAt(2) + num1.charAt(1) + num1.charAt(0);
        String reversedNum2 = "" + num2.charAt(2) + num2.charAt(1) + num2.charAt(0);
        
        if(Integer.parseInt(reversedNum1) > Integer.parseInt(reversedNum2)){
            bw.write(reversedNum1);
        }else{
            bw.write(reversedNum2);
        }
        bw.flush();
    }
}