import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int max = 0;
        int idx = 1;
 
        for(int i = 1; i <= 9 ; i++){
            int N = Integer.parseInt(br.readLine());
            if(N > max){
                max = N;
                idx = i;
            }
        }

        System.out.println(max);
        System.out.println(idx);
    }
}