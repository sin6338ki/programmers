import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        char[] inputArr = new char[input.length()];
        
        for(int i = 0 ; i < input.length() ; i++) {
        	inputArr[i] = input.charAt(i);
        }

        int totalTime = 0;
        
        for(char character : inputArr){
            if(character >= 65 && character <= 67){
                totalTime += 3;
            }else if(character >= 68 && character <= 70){
                totalTime += 4;
            }else if(character >= 71 && character <= 73){
                totalTime += 5;
            }else if(character >= 74 && character <= 76){
                totalTime += 6;
            }else if(character >= 77 && character <= 79){
                totalTime += 7;
            }else if(character >= 80 && character <= 83){
                totalTime += 8;
            }else if(character >= 84 && character <= 86){
                totalTime += 9;
            }else if(character >= 87 && character <= 90){
                totalTime += 10;
            }
        }
        bw.write(totalTime + "");
        bw.flush();
    }
}