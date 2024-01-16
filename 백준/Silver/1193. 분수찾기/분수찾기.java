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
//        System.out.println("num : " + num);

        int startNum = 1;
        int endNum = 1;

        /**
         * 미지의 수 x
         * startNUm = 1 2 3 4 ... x
         * endNum = x x-1 x-3 ... 1
         */
        int cnt = 0;
        int x = 1;
        boolean switching = false;

        while(true) {
            if(cnt == num){
                break;
            }else{
                for (int i = 0; i < x; i++) {
                    if(cnt == num){
                        break;
                    }else{
                        if(switching){
                            startNum = i + 1;
//                        System.out.println("endNum : " + endNum);
                            endNum = x - i;
//                        System.out.println("startNum : " + startNum);
                        }else{
                            endNum = i + 1;
//                        System.out.println("endNum : " + endNum);
                            startNum = x - i;
//                        System.out.println("startNum : " + startNum);
                        }
                        cnt++;
                    }
                }
            }
            switching = !switching;
            x++;
        }
        System.out.println(startNum + "/" + endNum);
    }
}