import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String[] arrayString = br.readLine().split(" ");
        int[] inputArray = new int[size];
        for(int i=0 ; i<size ; i++){ //수열 생성
            inputArray[i] = Integer.parseInt(arrayString[i]);
        }
        
        Stack<Integer> myStack = new Stack<>(); //스택 생성(인덱스 저장)
        int[] answerArray = new int[size]; //정답 수열 생성
        
        //수열의 첫번째 값은 무조건 스택에 저장된다. 
        myStack.push(0);
        
        for(int i=1 ; i<size ; i++){ //수열 1번부터 마지막까지
            while(!myStack.isEmpty() && inputArray[i] > inputArray[myStack.peek()]){ 
                answerArray[myStack.pop()] = inputArray[i];
            }
            myStack.push(i);
        }
        
        while(!myStack.isEmpty()){
            answerArray[myStack.pop()] = -1;
        }
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i : answerArray){
            bw.write(i + " ");
        }
        bw.close();
    }
}