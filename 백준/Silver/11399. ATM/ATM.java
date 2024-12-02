import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    /**
     * 삽입정렬 문제 줄 서 있는 사람의 수 N과  각 사람이 돈을 인출하는데 걸리는 시간 Pi가 주어졌을 때 각 사람이 돈을 인출하는 데 필요한 시간의 합의 최솟값 구하기
     * => Pi를 오름차순 정렬하여 합계 구하기(P1 + (P1 + P2) + (P1 + P2 + P3) + ... + (P1 + P2 + ... + Pi)) 제한시간
     * 1초, 1 <= N <= 1000, 1 <= Pi <= 1000
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N]; //Pi 배열
        int[] sumArray = new int[N]; //Pi 합 배열
        int index = 1;
        int sum = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }
        while (index < N) {
//            System.out.println("index: " + index);
            for (int i = 0; i <= index; i++) { //정렬된 범위 내에서 반복
                int value = array[index]; //삽입하고자 하는 값
                int insertPoint = index; //삽입 위치

                if (value < array[i]) {
                    insertPoint = i;
                }
//                System.out.println("insert point: " + insertPoint);
                //삽입 위치 부터 마지막까지 한자리씩 이동(시프트연산)
                for(int j = index ; j > insertPoint ; j--){
                    array[j] = array[j-1];
                }

                //데이터삽입
                array[insertPoint] = value;
         }
            index++;
//            System.out.println(Arrays.toString(array));
        }
        sumArray[0] = array[0];
        for (int i = 1; i < N; i++) {
            sumArray[i] = sumArray[i - 1] + array[i];
        }

        for (int i = 0; i < N; i++) {
            sum += sumArray[i];
        }
        System.out.println(sum);
    }
}