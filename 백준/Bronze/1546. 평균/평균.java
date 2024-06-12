import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int numberOfSubject = Integer.parseInt(st.nextToken()); //과목수
        double sumOfScore = 0;
        double maxScore = 0;
        st = new StringTokenizer(br.readLine());

        for(int i = 1 ; i <= numberOfSubject ; i++) {
            int score = Integer.parseInt(st.nextToken());
            if(score > maxScore) maxScore = score;
            sumOfScore += score;
        }

        double newAverage = getNewAverage(sumOfScore, maxScore, numberOfSubject);
        System.out.println(newAverage);
    }

    public static double getNewAverage(double sumOfScore, double maxScore, int numberOfSubject) {
        return  sumOfScore * 100.0 / maxScore / numberOfSubject;
    }

}
