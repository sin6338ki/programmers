import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 입력값 전체 대문자로 변환하여 charArray에 저장
		String input = br.readLine().toUpperCase();

		//중복 제거 문자열
		String distinct = "";
		for(String s : input.split("")) {
			if(!distinct.contains(s)) distinct+=s;
		}
		
		int max = 0;
		char maxChar = 'A';
		
		for(int i = 0 ; i < distinct.length() ; i++) {
			int sum = 0;
			for(int j = 0 ; j < input.length() ; j++) {
				if(distinct.charAt(i) == input.charAt(j)) {
					sum++;
				}
			}
			
			if(sum == max) {
				maxChar = '?';
			}else if(sum > max) {
				max = sum;
				maxChar = distinct.charAt(i);
			}
		}
		
		System.out.println(maxChar);
		
	}
}