import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int M = scanner.nextInt();
        int setH = 0;
        int setM = 0;
        
        if(M - 45 < 0){
            setM = M - 45 + 60;
            if(H == 0){
                setH = 23;
            }else{
                setH = H - 1;
            }
        }else{
            setM = M - 45;
            setH = H;
        }
        
        System.out.println(setH + " " + setM);
    }
}