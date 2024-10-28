import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    static int[] conditionArray;
    static int[] myConditionArray;
    static int countOfCondition;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int stringLength = Integer.parseInt(st.nextToken());
        int partialLength = Integer.parseInt(st.nextToken());
        char[] dnaCharArray = br.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());
        conditionArray = new int[4];
        myConditionArray = new int[4];
        int result = 0;
        countOfCondition = 0;
        
        for(int i=0 ; i<4 ; i++){
            conditionArray[i] = Integer.parseInt(st.nextToken());
            if(conditionArray[i] == 0){
                countOfCondition++;
            }
        }
        
        for(int i=0 ; i<partialLength ; i++){
            add(dnaCharArray[i]);
        }
        if(countOfCondition == 4){
            result++;
        }
        
        for(int i=partialLength ; i<stringLength ; i++){
            int j = i - partialLength;
            add(dnaCharArray[i]);
            remove(dnaCharArray[j]);
            
            if(countOfCondition == 4){
                result++;
            }
        }
        System.out.println(result);
        br.close();
        
    }
    
    private static void add(char c){
        switch(c){
            case 'A':
                myConditionArray[0]++;
                if(myConditionArray[0] == conditionArray[0]){
                    countOfCondition++;
                }
                break;
            case 'C':
                myConditionArray[1]++;
                if(myConditionArray[1] == conditionArray[1]){
                    countOfCondition++;
                }
                break;
            case 'G':
                myConditionArray[2]++;
                if(myConditionArray[2] == conditionArray[2]){
                    countOfCondition++;
                }
                break;
            case 'T':
                myConditionArray[3]++;
                if(myConditionArray[3] == conditionArray[3]){
                    countOfCondition++;
                }
                break;
        }
    }
    
        private static void remove(char c){
        switch(c){
            case 'A':
                if(myConditionArray[0] == conditionArray[0]){
                    countOfCondition--;
                }
                myConditionArray[0]--;
                break;
            case 'C':
                if(myConditionArray[1] == conditionArray[1]){
                    countOfCondition--;
                }
                myConditionArray[1]--;
                break;
            case 'G':
                if(myConditionArray[2] == conditionArray[2]){
                    countOfCondition--;
                }
                myConditionArray[2]--;
                break;
            case 'T':
                if(myConditionArray[3] == conditionArray[3]){
                    countOfCondition--;
                }
                myConditionArray[3]--;
                break;
        }
    }
}