import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        String input = br.readLine();
        String[] inputArr = input.split(" ");
        int searchNum = Integer.parseInt(br.readLine());
        int result = 0;
        
        for(String i : inputArr){
            if(Integer.parseInt(i) == searchNum){
                result++;
            }
        }
        System.out.println(result);
    }
}