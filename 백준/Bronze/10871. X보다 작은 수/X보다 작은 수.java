import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int N = Integer.parseInt(input.split(" ")[0]);
        int X = Integer.parseInt(input.split(" ")[1]);
        String inputNums = br.readLine();
        String[] inputArr = inputNums.split(" ");
        String result = "";
        for(String i : inputArr){
            if(Integer.parseInt(i) < X){
                result += i + " ";
            }
        }
        System.out.println(result);
    }
}