class Solution {
    public int solution(String[] board) {
        int answer = 1;
        int countO = 0;
        int countX = 0;
        char[][] boards = new char[3][3];
        
        for (int i = 0; i < 3; i++) {
        	for (int j = 0; j < 3; j++) {
        		char c = board[i].charAt(j);
        		if (c == 'O') {
        			countO++;
        		} else if (c == 'X') {
        			countX++;
        		}
        		
        		boards[i][j] = c;
        	}
        }
        
        if ((countO < countX) || countO > countX+1) {
        	return 0;
        }
        
        if (countO >= 3) {
        	int winO = win('O', boards);
        	int winX = win('X', boards);
        	
        	if (winO > 0 && winX > 0) {
        		return 0;
        	}
        	
        	if (winO > 0 && (countO-1 != countX || winX != 0)) {
        		return 0;
        	}
        	
        	if (winX > 0 && (countO != countX || winO != 0)) {
        		return 0;
        	}
        }
        
        return answer;
    }
	
	public static int win(char c, char[][] boards) {
		int win = 0;
		
		for (int i = 0; i < 3; i++) {
			if (boards[i][0] == c && boards[i][1] == c && boards[i][2] == c) {
				win++;
			}
			
			if (boards[0][i] == c && boards[1][i] == c && boards[2][i] == c) {
				win++;
			}
		}
		
		if (boards[0][0] == c && boards[1][1] == c && boards[2][2] == c) {
			win++;
		}
		
		if (boards[2][0] == c && boards[1][1] == c && boards[0][2] == c) {
			win++;
		}
		
		return win;
	}
}