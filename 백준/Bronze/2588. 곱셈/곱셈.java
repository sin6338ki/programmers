import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int temp = B;
        int sum = 0;

        for(int i = 1 ; i <= 3 ; i++){
            System.out.println(A*(B%10));
            B /= 10;
        }
        
        System.out.println(A*temp);
    }
}