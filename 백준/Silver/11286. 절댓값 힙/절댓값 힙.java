import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.PriorityQueue;
import java.lang.Math;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> myQueue = new PriorityQueue<>((o1, o2)->{
            int o1_abs = Math.abs(o1);
            int o2_abs = Math.abs(o2);
            
            if(o1_abs == o2_abs){
                return o1 > o2 ? 1 : -1 ;
            }else{
                return o1_abs - o2_abs;
            }
        });
        for(int i=0 ; i<N ; i++){
            int num = Integer.parseInt(br.readLine());
            if(num == 0){
                if(myQueue.isEmpty()){
                    System.out.println(0);
                }else{
                    System.out.println(myQueue.poll());
                }
            }else{
                myQueue.add(num);
            }
        }
    }
}