import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int M = scanner.nextInt();
        int takenTime = scanner.nextInt();
        int completeH = 0;
        int completeM = 0;
        
        if(takenTime / 60 > 0){
            completeH = H + takenTime/60;
            takenTime = takenTime % 60;
        }else{
            completeH = H;
        }
        
        if(M + takenTime == 60){
            completeM = 0;
            completeH += 1;
        }else if(M + takenTime > 60){
            completeM = M + takenTime - 60;
            completeH += 1;
        }else{
            completeM = M + takenTime;
        }
        
        if(completeH >= 24){
            completeH = completeH - 24;
        }

        System.out.println(completeH + " " + completeM);
    }
}