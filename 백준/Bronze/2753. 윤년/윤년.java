import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int isLeapYear = 0;
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            isLeapYear = 1;
        }
        System.out.println(isLeapYear);
    }
}