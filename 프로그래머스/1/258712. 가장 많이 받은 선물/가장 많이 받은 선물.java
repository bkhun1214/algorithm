class Solution {
    public int solution(String[] friends, String[] gifts) {
        int length = friends.length;
        int[][] giftCount = new int[length][length];
        int[] point = new int[length];
        
        // 선물 주고 받은 횟수 구하기
        for (String gift : gifts) {
        	String[] give = gift.split(" ");
        	giftCount[findIndex(friends, give[0])][findIndex(friends, give[1])]++;
        }
        
        // 선물 지수 구하기
        for (int i = 0; i < length; i++) {
        	
        	int give = 0;
        	int take = 0;
        	
        	for (int j = 0; j < length; j++) {
        		give += giftCount[i][j];
        	}
        	
        	for (int k = 0; k < length; k++) {
        		take += giftCount[k][i];
        	}
        	
        	point[i] = give - take;
        }
        
        // 선물 가장 많이 받을 개수 구하기
        int answer = 0;
        
        for (int l = 0; l < length; l++) {
        	int count = 0;
        	
        	for (int m = 0; m < length; m++) {
        		if (l == m) {
        			continue;
        		}
        		
        		// 선물을 주고 받았다면
        		if (giftCount[l][m] != 0 || giftCount[m][l] != 0) {
        			
        			// 더 많은 선물을 주면 받음
        			if (giftCount[l][m] > giftCount[m][l]) {
        				count ++;
        			}
        			
        		}
        		
        		// 두 사람이 선물을 주고받은 기록이 하나도 없거나 주고받은 수가 같다면
        		if (giftCount[l][m] == giftCount[m][l]) {
        			
        			// 선물지수가 크면 받음
        			if (point[l] > point[m]) {
        				count ++;
        			}
        		}
        		
        	}
        	
        	// 선물 가장 많이 받을 개수 교체
        	if (answer < count) {
        		answer = count;
        	}
        }
        
        return answer;
    }
	
	public int findIndex(String[] friends, String value) {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i].equals(value)) {
				return i;
			}
		}
		
		return -1;
	}
}