import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] temp = Long.toString(n).split("");
        Arrays.sort(temp, Collections.reverseOrder());
        answer = Long.parseLong(String.join("", temp));
        return answer;
    }
}