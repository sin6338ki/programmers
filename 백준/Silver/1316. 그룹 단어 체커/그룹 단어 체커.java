import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int round = Integer.parseInt(br.readLine());
		int cnt = 0;

		for (int n = 0; n < round; n++) {
			String[] input = br.readLine().split("");
			boolean isGroup = true;

			for (int i = 1; i < input.length; i++) {
				// 1. 연속되는 단어인지 여부 확인
				// - 연속되는 단어일 경우 => 다음 단어 확인
				if (!input[i - 1].equals(input[i])) { // - 연속되지 않는 단어일 경우 => 선택 단어가 뒤에 없어야 함
					for (int j = i ; j < input.length; j++) {
						if (input[i-1].equals(input[j])) {
							isGroup = false;
						}
					}
				}
			}
			
			if(isGroup) cnt++;

		}

		System.out.println(cnt);

	}
}