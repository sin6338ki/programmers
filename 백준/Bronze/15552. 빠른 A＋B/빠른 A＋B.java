import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String print = "";
        
        for(long i = 1 ; i <= N ; i++){
            String cal = br.readLine();
            String result = Integer.parseInt(cal.split(" ")[0])+Integer.parseInt(cal.split(" ")[1]) + "\n";
            bw.write(result);
        }
        
        bw.flush();
    }
}