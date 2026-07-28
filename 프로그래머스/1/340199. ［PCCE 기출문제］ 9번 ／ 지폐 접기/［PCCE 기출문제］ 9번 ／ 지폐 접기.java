class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;

        int maxWallet = wallet[0];
        int minWallet = wallet[1];
        if (wallet[0] < wallet[1]) {
            maxWallet = wallet[1];
            minWallet = wallet[0];
        }

        while (true) {
            if (bill[0] > bill[1]) {
                int temp = bill[0];
                bill[0] = bill[1];
                bill[1] = temp;
            }

            if (bill[0] <= minWallet && bill[1] <= maxWallet) {
                break;
            }

            bill[1] = bill[1] / 2;

            answer ++;
        }
        
        return answer;
    }
}