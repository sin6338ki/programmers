import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String number = st.nextToken();
		int scale = Integer.parseInt(st.nextToken());

		int answer = 0;

		for (int i = 0; i < number.length(); i++) {

			// A ~ Z = 10 ~ 35
			int n = 0;
			if (number.charAt(i) >= 65 && number.charAt(i) <= 90) {
				n = number.charAt(i) - 55;
			} else {
				n = Integer.parseInt(number.split("")[i]);
			}
//			System.out.println(n + "*" + (Math.pow(scale, number.length() - i)));
			answer += n * (Math.pow(scale, number.length() - i -1));
		}

		System.out.println(answer);

	}
}