class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        
        for (int i = 0; i < schedules.length; i++) {
        	
        	int hour = schedules[i] / 100;
    		int time = (schedules[i] % 100) + 10;
    		
    		if (time >= 60) {
    			hour += 1;
    			time -= 60;
    		}
    		int attend = 100 * hour + time;
        	int day = startday;
        	answer++;
        	for (int j = 0; j < timelogs[i].length; j++) {
        		if (day == 6) {
        			day ++;
        			continue;
        		} else if (day == 7) {
        			day = 1;
        			continue;
        		}
        		
        		if (attend < timelogs[i][j]) {
        			answer--;
        			break;
        		}
        		day++;
        	}
        }
        return answer;
    }
}