import java.util.ArrayList;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i<10; i++){
            arr.add(i);
        }
        
        for(int i = 0; i<numbers.length; i++){
            int tmp = arr.indexOf(numbers[i]);
            if(tmp!=-1){
                arr.remove(tmp);
            }
        }
        
        answer = arr.stream().mapToInt(Integer::intValue).sum();
        
        return answer;
    }
}