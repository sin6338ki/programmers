import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = "";

        while((input = br.readLine()) != null && !input.isEmpty()) {
        	bw.write(input + "\n");
//        	System.out.println(input);

        }
        bw.flush();
        bw.close();
    }
}