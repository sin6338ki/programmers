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
		int T = Integer.parseInt(st.nextToken());
		int sum = 0;
		// 2개 공유 -> 4, 4, 4, 4, ... => 4
		int secondPoint = 4;
		// 3개 공유 -> 0, 4(1*4), 12(3*4), 28(7*4), 60(15*4), 124(31*4) (4*(앞에거+1)
		// 4개 공유 -> 0, 1, 9, 49(7*7), 225(15*15), 961(31*31)
		int value = 0;
		for (int i = 1; i <= T; i++) {
			int thirdPoint = ((2 * value) + 1) * 4;
			int fourthPoint = ((2 * value) + 1) * ((2 * value) + 1);
			value = 2 * value + 1;
			sum = secondPoint + thirdPoint + fourthPoint;
		}

		System.out.println(sum);

	}
}