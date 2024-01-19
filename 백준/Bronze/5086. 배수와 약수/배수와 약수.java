import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int input1 = Integer.parseInt(st.nextToken());
                int input2 = Integer.parseInt(st.nextToken());

                if(input1 == 0 && input2 == 0) break;

                if (input2 / input1 > 0 && input2 % input1 == 0) {
                    System.out.println("factor");
                } else if (input1 / input2 > 0 && input1 % input2 == 0) {
                    System.out.println("multiple");
                } else {
                    System.out.println("neither");
                }
        }
    }
}