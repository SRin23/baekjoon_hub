import java.util.TreeSet;
import java.util.Iterator;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer;
        TreeSet<Integer> sumArr = new TreeSet<Integer>();
        for(int i = 0; i<numbers.length; i++){
            for(int j = i+1; j<numbers.length; j++){
                sumArr.add(numbers[i] + numbers[j]);
            }
        }
        
        answer = 
            Arrays.stream(sumArr.toArray(new Integer[0]))
            .mapToInt(Integer::intValue)
            .toArray();
        return answer;
    }
}