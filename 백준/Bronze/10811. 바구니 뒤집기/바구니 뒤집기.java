import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int basketCnt = Integer.parseInt(input.split(" ")[0]); //바구니 개수
        int inputCnt = Integer.parseInt(input.split(" ")[1]); //입력받는 수
        int[] basket = new int[basketCnt]; //바구니 정렬 순서
        
        //바구니 정렬
        for(int n = 0 ; n < basketCnt ; n++){
            basket[n] = n+1;
        }
        
        for(int i = 1 ; i <= inputCnt ; i++){
            String order = br.readLine();
            int start = Integer.parseInt(order.split(" ")[0])-1;
            int end = Integer.parseInt(order.split(" ")[1])-1;
            
            //end-start = 짝수일때
            if((end - start) % 2 == 0){
                for(int j = start ; j < (start + end)/2 ; j++){
                    int temp = basket[j];
                    basket[j] = basket[start + end - j];
                    basket[start + end - j] = temp;
                }
            }else{ //end-start 홀수일때
                for(int j = start ; j < (start + end)/2 + 1; j++){
                    int temp = basket[j];
                    basket[j] = basket[start + end - j];
                    basket[start + end - j] = temp;
                }
            }
        }
        for(int num : basket){
            System.out.print(num + " ");
        }
    }
}