import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int cntOfAlphabet = 0;
		String[] croatiaAlphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		for(String alpha : croatiaAlphabet) {
			if(input.contains(alpha)) {
				input = input.replace(alpha, " ");
//				System.out.println(input);
			}
		}
		
		cntOfAlphabet = input.length();
		System.out.println(cntOfAlphabet);
		
	}
}