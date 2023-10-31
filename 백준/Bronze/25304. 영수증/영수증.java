import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        int count = Integer.parseInt(br.readLine());
        int calculator = 0;
        
        for(long i = 1 ; i <= count ; i++){
            String item = br.readLine();
            int itemPrice = Integer.parseInt(item.split(" ")[0]);
            int itemCount = Integer.parseInt(item.split(" ")[1]);
            calculator += itemPrice * itemCount;
        }
        
        if(calculator == total){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}