import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[] array = new int[count];
        for(int i = 0 ; i < count ; i++){
            array[i] = Integer.parseInt(br.readLine());
        }
        
        int num = 1;
        Boolean result = true;
        StringBuilder answer = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i < count ; i++){
            int su = array[i]; //수열의 수
            if(su >= num){
                while(su >= num){
                    stack.push(num++);
                    answer.append("+\n");
                }
                stack.pop();
                answer.append("-\n");
            }else{
                int n = stack.pop();
                if(n > su){
                    System.out.println("NO");
                    result = false;
                    break;
                }else{
                    answer.append("-\n");
                }
            }
        }
        if(result){
            System.out.println(answer.toString());
        }
    }
}