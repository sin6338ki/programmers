import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Deque;
import java.util.LinkedList;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int countOfNumber = Integer.parseInt(st.nextToken());
        int sizeOfWindow = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        Deque<Node> deque = new LinkedList<>();
        
        for(int i = 0 ; i < countOfNumber ; i++){
            int now = Integer.parseInt(st.nextToken());
            
            while(!deque.isEmpty() && deque.getLast().value > now){
                deque.removeLast();
            }
            deque.addLast(new Node(now, i));
            if(i - deque.getFirst().index >= sizeOfWindow){
                deque.removeFirst();
            }
            bw.write(deque.getFirst().value + " ");
        }
        bw.flush();
        bw.close();
    }
    
    static class Node{
        int value;
        int index;
        
        Node(int value, int index){
            this.value = value;
            this.index = index;
        }
    }
}