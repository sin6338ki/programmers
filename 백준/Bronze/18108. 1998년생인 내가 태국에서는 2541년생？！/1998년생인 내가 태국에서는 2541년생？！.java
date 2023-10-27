import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if(year >= 1000 && year <= 3000){
            System.out.println(year - (2541 - 1998));
        }
    }
}