import java.util.Collections;
import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] splitStr = s.split("");
        Arrays.sort(splitStr, Collections.reverseOrder());
        answer = String.join("", splitStr);
        return answer;
    }
}