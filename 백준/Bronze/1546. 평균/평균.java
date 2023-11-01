import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int subjectCnt = Integer.parseInt(br.readLine());
        String inputScore = br.readLine();
        String[] scoreArr = inputScore.split(" ");
        
        //과목의 최댓값 찾기
        int maxScore = Integer.parseInt(scoreArr[0]);
        for(String score : scoreArr){
            if(Integer.parseInt(score) > maxScore){
                maxScore = Integer.parseInt(score);
            }
        }
        
        //새로운 점수 합계 구하기 
        double newScoreTotal = 0;
        for(String score : scoreArr){
            newScoreTotal += Double.parseDouble(score) / maxScore * 100;
        }
        
        //새로운 평균 구하기 
        double avg = newScoreTotal / subjectCnt;
        System.out.println(avg);
    }
}