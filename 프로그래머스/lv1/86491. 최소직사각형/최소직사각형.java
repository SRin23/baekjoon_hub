class Solution {
    public int solution(int[][] sizes) {
        int answer = 1;
        for(int i = 0; i<sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }
        for(int i = 0; i<sizes[0].length; i++){
            int max = 0;
            for(int j = 0; j<sizes.length; j++){
                max = Math.max(max, sizes[j][i]);
            }
            answer*=max;
        }
        return answer;
    }
}