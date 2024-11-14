import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N];
        for(int i=0 ; i<N ; i++){
            array[i] = Integer.parseInt(br.readLine());
        }
        
        for(int i=0 ; i<N ; i++){
            for(int j=1 ; j<N-i ; j++){
                if(array[j-1] > array[j]){
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
        
        for(int i : array){
            System.out.println(i);
        }
    }
}