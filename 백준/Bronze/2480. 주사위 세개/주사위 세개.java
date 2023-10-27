import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int diceA = scanner.nextInt();
        int diceB = scanner.nextInt();
        int diceC = scanner.nextInt();
        int price = 0;
        
        if(diceA == diceB && diceB == diceC){
            price = 10000 + diceA * 1000;
        }else if(diceA == diceB || diceA == diceC){
            price = 1000 + diceA * 100;
        }else if(diceB == diceC){
            price = 1000 + diceB * 100;
        }else{
            int[] dice = {diceA, diceB, diceC};
            int max = diceA;
            
            for(int num : dice){
             if(num > max){
                 max = num;
             }   
            }
            price = max * 100; 
        }

        System.out.println(price);
    }
}