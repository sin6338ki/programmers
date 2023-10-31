import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String inputNums = br.readLine();
        String[] inputArr = inputNums.split(" ");
        int[] inputArrNum = new int[N];
       
        for(int i = 0 ; i < N ; i++){
            inputArrNum[i] = Integer.parseInt(inputArr[i]);
        }
        
        int max = inputArrNum[0];
        int min = inputArrNum[0];
        
        for(int num : inputArrNum){
            if(num < min){
                min = num;
            }else if(num > max){
                max = num;
            }
        }
        System.out.println(min + " " + max);
    }
}