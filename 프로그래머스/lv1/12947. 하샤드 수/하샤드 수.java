class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String[] num = Integer.toString(x).split("");
        int sum = 0;
        for(int i = 0; i<num.length; i++){
            sum+=Integer.valueOf(num[i]);
        }
        if(x%sum!=0) answer = false; 
        return answer;
    }
}