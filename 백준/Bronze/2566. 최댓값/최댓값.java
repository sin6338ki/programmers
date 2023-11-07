import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int max = -1;
        int rowLocation = 1;
        int colLocation = 1;
        
        for(int i = 0 ; i < 9 ; i++){
            String input = br.readLine();
            for(int j = 0 ; j < 9 ; j++){
                if(Integer.parseInt(input.split(" ")[j]) > max){
                    max = Integer.parseInt(input.split(" ")[j]);
                    rowLocation = i+1;
                    colLocation = j+1;
                }
            }
        }
        
        bw.write(max + "\n");
        bw.write(rowLocation + " " + colLocation);
        bw.flush();
        bw.close();
    }
}