import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String print = "Case #";
        
        for(long i = 1 ; i <= N ; i++){
            String cal = br.readLine();
            String num1 = cal.split(" ")[0];
            String num2 = cal.split(" ")[1];
            int result = Integer.parseInt(num1)+Integer.parseInt(num2);
            bw.write(print + i + ": " + num1 + " + " + num2 + 
 " = " + result + "\n");
        }
        
        bw.flush();
    }
}