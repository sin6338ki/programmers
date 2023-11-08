import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
           
        boolean[][] array = new boolean[101][101]; //가로, 세로 101 정사각형 도화지
        int area = 0;
        
        int cnt = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < cnt ; i++){
            String input = br.readLine();
            int x = Integer.parseInt(input.split(" ")[0]);
            int y = Integer.parseInt(input.split(" ")[1]);
            
            //기존에 칠해진 곳이 없다면(true) 해당 영역 true로 변경, area 추가
            for(int j = x ; j < x+10 ; j++){
                for(int l = y ; l < y+10 ; l++){
                    if(!array[j][l]){
                        array[j][l] = true;
                        area++;
                    }
                }
            }
        }
        bw.write(area + "");
        bw.flush();
        bw.close();
    }
}