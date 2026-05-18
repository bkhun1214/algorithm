class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int out = (brown + 4) / 2;
        
        for (int i = out - 3; i > 2; i--) {
            int h = i;
            int w = out - h;
            
            if ((h-2) * (w-2) == yellow) {
                answer[0] = h;
                answer[1] = w;
                break;
            }
        }
        
        return answer;
    }
}