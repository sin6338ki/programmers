import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] inputArr = input.split(" ");
		int[] amount = {1,1,2,2,2,8};
		
		for(int i = 0 ; i < inputArr.length ; i++) {
			if(amount[i] >= Integer.parseInt(inputArr[i])) {
				amount[i] -= Integer.parseInt(inputArr[i]);
			}else {
				amount[i] = -(Integer.parseInt(inputArr[i]) - amount[i]);
			}
			System.out.print(amount[i] + " ");
		}
	}
}