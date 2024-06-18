class Solution {
    public String[] reorderLogFiles(String[] logs) {
        List<String> letterLogs = new ArrayList<String>();
        List<String> digitLogs = new ArrayList<String>();
        
        //문자 로그, 숫자 로그 저장
        for(String log : logs){
            if(Character.isDigit(log.split(" ")[1].charAt(0))){
                digitLogs.add(log);
            }else{
                letterLogs.add(log);
            }
        }
        
        //문자로그 비교
        letterLogs.sort((s1, s2) -> {
            String[] s1x = s1.split(" ", 2);
            String[] s2x = s2.split(" ", 2);
            
            int compared = s1x[1].compareTo(s2x[1]);
            if(compared == 0){
                return s1x[0].compareTo(s2x[0]);
            }else{
                return compared;
            }
        });
        
        //문자로그 뒤 숫자로그 붙이기
        letterLogs.addAll(digitLogs);
        
        //문자 배열로 반환
        return letterLogs.toArray(new String[0]);
        
    }
}