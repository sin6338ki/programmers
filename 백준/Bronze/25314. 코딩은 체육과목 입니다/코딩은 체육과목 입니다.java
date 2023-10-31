import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String print = "";
        
        for(long i = 1 ; i <= (N/4) ; i++){
            print += "long ";    
        }
        
        System.out.println(print + "int");
    }
}