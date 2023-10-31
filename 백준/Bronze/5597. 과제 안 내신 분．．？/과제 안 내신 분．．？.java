import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] submitStuList = new int[30];
        Arrays.fill(submitStuList, 0);
        String result = "";
        
        for(int j = 0; j < 28 ; j++){
           int stuNum = Integer.parseInt(br.readLine());
           submitStuList[stuNum-1] = stuNum;
        }
        
       for(int i = 0 ; i < 30 ; i++){
           if(submitStuList[i] == 0){
               System.out.println(i+1);
           }
       }
    }
}