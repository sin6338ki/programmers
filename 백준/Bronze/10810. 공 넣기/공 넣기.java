import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String basket = br.readLine();
        int N = Integer.parseInt(basket.split(" ")[0]);
        int M = Integer.parseInt(basket.split(" ")[1]);
        int[] ball = new int[N];
        
        for(int idx = 0 ; idx < N ; idx++){
            ball[idx] = 0;
        }
        
        for(int i = 1 ; i <= M ; i++){
            String how = br.readLine();
            int start = Integer.parseInt(how.split(" ")[0]) - 1;
            int end = Integer.parseInt(how.split(" ")[1]) - 1; 
            int ballNum = Integer.parseInt(how.split(" ")[2]);
            for(int j = start ; j <= end ; j++){
                ball[j] = ballNum;
            }
        }
        
        for(int num : ball){
             System.out.print(num + " ");  
        }
    }
}