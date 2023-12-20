import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		
		for(int i = 1 ; i <= input; i++) {
			for(int j = input-i-1 ; j >= 0 ; j--) {
				System.out.print(" ");
			}
			for(int l = 1 ; l < i*2 ; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int n = 1 ; n < input ; n++) {
			for(int p = 1 ; p <= n ; p++) {
				System.out.print(" ");
			}
			for(int m = (input-n)*2 - 1 ; m > 0 ; m--) {
				System.out.print("*");
			}
			System.out.println();
		}	
	}
}