import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String result = "";
        while(true){
            String input = br.readLine();
            if(input == null){
                break;
            }
            int num1 = Integer.parseInt(input.split(" ")[0]);
            int num2 = Integer.parseInt(input.split(" ")[1]);
            result += num1 + num2 + "\n";
        }
        bw.write(result);
        bw.flush();
    }
}