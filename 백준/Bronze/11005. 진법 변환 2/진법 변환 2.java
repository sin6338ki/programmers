import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int decimal = Integer.parseInt(st.nextToken());
		int scale = Integer.parseInt(st.nextToken());

		String answer = "";

		// 나머지 저장
		List<Integer> before = new ArrayList<Integer>();

		while (true) {
			
			if (decimal < scale) {
				before.add(decimal);
				break;
			}
			
			before.add(decimal % scale);
			decimal /= scale;
		}

//		for (int n : before) {
//			System.out.println(n);
//		}

		for (int i = before.size() - 1; i >= 0; i--) {
			if (before.get(i) >= 10 && before.get(i) < 36) {
				char c = (char) (before.get(i) + 55);
				answer += c;
			} else {
				answer += before.get(i);
			}
		}

		System.out.println(answer);

	}
}