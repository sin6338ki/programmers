import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while(true){
            String cal = br.readLine();
            int num1 = Integer.parseInt(cal.split(" ")[0]);
            int num2 = Integer.parseInt(cal.split(" ")[1]);
            
            if(num1 == 0 && num2 == 0){
                bw.flush();
                break;
            }
            bw.write(num1+num2+"\n");
        }
    }
}