import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] mats, String[][] park) {
        Arrays.sort(mats);
        
        for (int i = mats.length -1; i >= 0; i--) {
        	int mat = mats[i];
        	
        	
        	for (int j = 0; j < park.length; j++) {
        		for (int k = 0; k < park[j].length; k++) {
        			int w = k + mat - 1;
        			int h = j + mat - 1;
        			
        			if (park[j][k].equals("-1") && h < park.length && w < park[j].length) {
        				boolean possible = true;
        				
        				for (int l = 0; l < mat; l++) {
        					for (int m = 0; m < mat; m++) {
        						if (!park[j+l][k+m].equals("-1")) {
        							possible = false;
        							break;
        						}
        					}
        				}
        				if (possible) {
        					return mat;
        				}
        			}
        		}
        	}
        }
        
        return -1;
    }
}