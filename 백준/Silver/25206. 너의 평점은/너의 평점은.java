import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		double sumOfuSupply = 0; //학점 * 과목평점의 합
		double sumOfGrade = 0; //학점의 합
		//전공 평점을 계산해주는 프로그램 = SUM(학점*과목평점)/SUM(학점)
		for(int i = 1 ; i <= 20 ; i++) {
			String input = br.readLine();
			double grade = Double.parseDouble(input.split(" ")[1]);
			double GPA = 0;
			boolean pass = false;
			
			switch(input.split(" ")[2]) {
			case "A+":
				GPA = 4.5;
				break;
			case "A0":
				GPA = 4.0;
				break;
			case "B+":
				GPA = 3.5;
				break;
			case "B0":
				GPA = 3.0;
				break;
			case "C+":
				GPA = 2.5;
				break;
			case "C0":
				GPA = 2.0;
				break;
			case "D+":
				GPA = 1.5;
				break;
			case "D0":
				GPA = 1.0;
				break;
			case "F" :
				GPA = 0.0;
				break;
			case "P":
				pass = true;
				break;
			}
			
			if(!pass) {
				sumOfuSupply += grade * GPA;
//				System.out.println("sumOfSuuply : " + sumOfuSupply);
				sumOfGrade += grade;	
//				System.out.println("sumOfGrade : " + sumOfGrade);
			}
		}
		
		double avg = sumOfuSupply / sumOfGrade;
		System.out.println(avg);
	}
}