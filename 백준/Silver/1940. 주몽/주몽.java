import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int countOfMaterials = Integer.parseInt(br.readLine());
        int sumOfNumberForGabob = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] materials = new int[countOfMaterials];
        for(int i = 0 ; i < materials.length ; i++){
            materials[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(materials); //오름차순 정렬
        
        int startIndex = 0;
        int endIndex = countOfMaterials - 1;
        int count = 0;
        
        while(startIndex < endIndex){
            if(materials[startIndex] + materials[endIndex] < sumOfNumberForGabob){
                startIndex++;
            }else if(materials[startIndex] + materials[endIndex] > sumOfNumberForGabob){
                endIndex--;
            }else{
                count++;
                startIndex++;
                endIndex--;
            }
        }
        System.out.println(count);
        br.close();
        
    }
}