class Solution {
    public String solution(String number, int k) {
        StringBuffer answer = new StringBuffer();
        int size = number.length() - k;
        int index = 0;
        
        while (k > 0 && answer.length() < size) {
            int max = 0;
            int count = 0;
            for (int i = 0; i < k+1; i++) {
                int num = number.charAt(index+i) - '0';
                if (max < num) {
                    max = num;
                    count = i;
                }
            }
            
            index += count+1;
            answer.append(max);
            k -= count;
        }
        while (index < number.length() && answer.length() < size) {
            answer.append(number.charAt(index));
            index++;
        }
        
        return answer.toString();
    }
}