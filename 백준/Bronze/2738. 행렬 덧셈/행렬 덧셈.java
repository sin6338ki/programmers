import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String size = br.readLine();
        int N = Integer.parseInt(size.split(" ")[0]);
        int M = Integer.parseInt(size.split(" ")[1]);
        
        int[][] matrixA = new int[N][M];
        int[][] matrixB = new int[N][M];
        
        for(int i = 0 ; i < N ; i++){
            String input = br.readLine();
            for(int j = 0 ; j < M ; j++){
                matrixA[i][j] = Integer.parseInt(input.split(" ")[j]);
            }
        }
        
        for(int n = 0 ; n < N ; n++){
            String input = br.readLine();
            for(int m = 0 ; m < M ; m++){
                matrixB[n][m] = matrixA[n][m] + Integer.parseInt(input.split(" ")[m]);
            }
        }
        
        for(int k = 0; k < N ; k++){
            for(int l = 0 ; l < M ; l++){
                bw.write(matrixB[k][l] + " ");
                bw.flush();
            }
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}