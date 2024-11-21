import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine()); //배열의 크기
        MyData[] A = new MyData[size];
        for(int i=0 ; i<size ; i++){
            A[i] = new MyData(Integer.parseInt(br.readLine()), i);
        }
        Arrays.sort(A); //배열 정렬
        int max = 0;
        for(int i=0 ; i<size ; i++){
            //기존 인덱스에서 왼쪽으로 가장 많이 이동한 횟수 찾기
            if(max < A[i].index - i){
                max = A[i].index - i;
            }
        }
        System.out.println(max+1);
    }
    
    //value와 index를 가지는 정렬 가능한 객체 정의
    private static class MyData implements Comparable<MyData>{ 
        int value;
        int index;
        public MyData(int value, int index){
            this.value = value;
            this.index = index;
        }
        
        @Override
        public int compareTo(MyData o){ //value 기준으로 오름차순 정렬
            return this.value - o.value;
        }
    }
}