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
//		System.out.println("T : " + T);

		for (int i = 1; i <= T; i++) {
			int change = Integer.parseInt(br.readLine());
//			System.out.println("change : " + change);
			int quarter = (change / 25);
			change %= 25;
//			System.out.println("change : " + change);
			int dime = (change / 10);
			change %= 10;
//			System.out.println("change : " + change);
			int nickel = (change / 5);
			change %= 5;
//			System.out.println("change : " + change);
			int penny = (change / 1);
			change %= 1;
//			System.out.println("change : " + change);
			System.out.println(quarter + " " + dime + " " + nickel + " " + penny);

		}
	}
}