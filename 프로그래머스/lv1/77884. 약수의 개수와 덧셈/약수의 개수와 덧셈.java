class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i<=right; i++){
            int divisor = 0;
            //System.out.print("[" + i + "] : ");
            for(int j = 1; j<=i; j++){
                if(i%j==0){
                    //System.out.print(j + ", ");
                    divisor++;
                }
            }
            System.out.println();
            if(divisor%2==0) answer+=i;
            else answer-=i;
        }
        return answer;
    }
}