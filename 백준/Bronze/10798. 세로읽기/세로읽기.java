import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[][] matrix = new String[5][15]; 
        
        for(int i=0 ; i < 5 ; i++){
            String input = br.readLine();
            for(int j=0 ; j < input.length() ; j++){
                matrix[i][j] = input.split("")[j];
            }
        }
        
        for(int l=0 ; l<15; l++){
            for(int n=0 ; n<5 ; n++){
                if(matrix[n][l] != null){
                    bw.write(matrix[n][l]);
                }
            }
        }
        bw.flush();
        bw.close();
    }
}