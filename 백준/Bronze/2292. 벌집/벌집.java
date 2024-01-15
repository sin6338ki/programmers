import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        /**
         * 1 -> 1 (6*0 + 1)
         * 2 ~ 7 (6*1 + 1) -> 2 / +6
         * 8 ~ 19 (6*(1+2) + 1) -> 3 / +12
         * 20 ~ 37 (6*(1+2+3) + 1) -> 4 / +18
         * 38 ~ 61 (6*(1+2+3+4) + 1) -> 5 / +24
         * 62 ~ 91 (6*(1+2+3+4+5) + 1) -> 6 / + 30
         *
         * 6 * (1 + 2 + ... + n) + 1 => n+1 개방을 지남
         */
        int n = 1;
        while(true){
            if(num == 1){
                System.out.println(1);
                break;
            }else if(num > (6*factorial(n-1))+1 && num <= (6*factorial(n))+1){
//                System.out.println("before 조건 : "+6*(factorial(n-1)+1));
//                System.out.println("after 조건 : "+6*(factorial(n)+1));
                System.out.println(n+1);
                break;
            }
            n++;
        }

    }

    public static int factorial(int n){
        //factorial 계산
        int result = 0;
        if(n == 0){
            return 0;
        }else {
            for(int i = 1 ; i <= n ; i++){
                result += i;
            }
            return result;
        }
    }
}