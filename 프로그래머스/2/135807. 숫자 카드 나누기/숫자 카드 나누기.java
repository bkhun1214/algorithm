import java.util.*;

class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;
        
        int numA = arrayA[0];
        if (arrayA.length > 1) {
        	numA = search(arrayA[0], arrayA[1]);
        }
        
        if (numA != 1) {
	        for (int i = 2; i < arrayA.length; i++) {
	        	numA = search(numA, arrayA[i]);
	        	
	        	if (numA == 1) {
	        		break;
	        	}
	        }
        }
        
        int numB = arrayB[0];
        if (arrayB.length > 1) {
        	numB = search(arrayB[0], arrayB[1]);
        }
        
        if (numB != 1) {
        	for (int i = 2; i < arrayB.length; i++) {
        		numB = search(numB, arrayB[i]);
        		
        		if (numB == 1) {
        			break;
        		}
        	}
        }
        
        if (numA != 1) {
        	boolean b = true;
        	for (int i = 0; i < arrayB.length; i++) {
        		if (arrayB[i] % numA == 0) {
        			b = false;
        			break;
        		}
        	}
        	
        	if (b && answer < numA) {
        		answer = numA;
        	}
        }
        
        if (numB != 1) {
        	boolean b = true;
        	for (int i = 0; i < arrayA.length; i++) {
        		if (arrayA[i] % numB == 0) {
        			b = false;
        			break;
        		}
        	}
        	
        	if (b && answer < numB) {
        		answer = numB;
        	}
        }
        
        return answer;
    }
	
	public int search(int a, int b) {
		if (a < b) {
			int temp = a;
			a = b;
			b = temp;
		}
		
		while (b != 0) {
			int temp = a % b;
			a = b;
			b = temp;
		}
		
		return a;
	}
}