import java.util.StringTokenizer;

class Solution {
    public String solution(String s) {
        String answer = "";
        // StringTokenizer st = new StringTokenizer(s, " ");
        // StringBuilder sb = new StringBuilder();
        // while(st.hasMoreTokens()){
        //     String temp = st.nextToken().toUpperCase();
        //     for(int i = 0; i<temp.length(); i++){
        //         if(i%2==1){
        //             sb.append(temp.substring(i, i+1).toLowerCase());
        //         }else{
        //             sb.append(temp.substring(i, i+1));
        //         }
        //     }
        //     if(st.hasMoreTokens()){
        //         sb.append(" ");   
        //     }
        // }
        // answer = sb.toString();
        
        s = s.toUpperCase();
        int check = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)==' '){
                check = 0;
                continue;
            }
            if(check%2==1){
                s = s.substring(0, i).concat(s.substring(i, i+1).toLowerCase()).concat(s.substring(i+1));
            }
            check++;
        }
        answer = s;
        return answer;
    }
}