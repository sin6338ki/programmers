import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> myQueue = new LinkedList<>();
        for(int i=1 ; i<=n ; i++){ //큐에 1부터 N까지 쌓기
            myQueue.add(i);
        }
        
        while(myQueue.size() > 1){
            myQueue.poll();
            myQueue.add(myQueue.poll());
        }
        
        System.out.println(myQueue.poll());
    }
}