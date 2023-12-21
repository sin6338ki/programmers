import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputWord = br.readLine();
		int numOfChar = inputWord.length();
//		System.out.println(numOfChar);
		boolean isSame = true;

		for (int i = 0; i <= numOfChar / 2 - 1; i++) {
//			System.out.println(inputWord.charAt(i));
//			System.out.println(inputWord.charAt(numOfChar - 1 - i));

			if (inputWord.charAt(i) != inputWord.charAt(numOfChar - 1 - i)) {
				isSame = false;
			}
		}

		if (isSame == false || numOfChar == 0) {
			System.out.println(0);
		} else if (isSame == true) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}

	}

}