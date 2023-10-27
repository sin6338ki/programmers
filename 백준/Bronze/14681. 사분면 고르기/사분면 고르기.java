import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int quadrant = 0;
        if(x>0 && y>0){
            quadrant = 1;
        }else if(x>0 && y<0){
            quadrant = 4;
        }else if(x<0 && y>0){
            quadrant = 2;
        }else{
            quadrant = 3;
        }
        System.out.println(quadrant);
    }
}