import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int numA = 1;
        int numB = 1;
        Scanner sc = new Scanner(System.in);
        numA = sc.nextInt();
        numB = sc.nextInt();
        
        if(numA > 0 && numB < 10){
            System.out.println(numA * numB);
        }
        
    }
}