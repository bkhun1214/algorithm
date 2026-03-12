import java.util.*;

class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        StringBuffer sb = new StringBuffer();
        
        while (n > 0) {
        	sb.append(n % k);
        	n = n / k;
        }
        sb = sb.reverse();
        
        List<Long> p = new ArrayList<>();
        int index;
        while ((index = sb.indexOf("0")) != -1) {
        	String num = sb.substring(0, index);
        	if (num.isEmpty()) {
        		sb = sb.delete(0, index+1);
        		continue;
        	}
        	p.add(Long.parseLong(num));
        	sb = sb.delete(0, index+1);
        }
        
        if (sb.length() != 0) {
        	p.add(Long.parseLong(sb.toString()));
        }
        
        for (int i = 0; i < p.size(); i++) {
        	Long l = p.get(i);
        	if (l == 1) {
        		continue;
        	} else if (l == 2) {
        		answer++;
        		continue;
        	}
        	boolean isPrime = true;
        	for (Long j = 2L; j < Math.sqrt(l)+1; j++) {
        		if (l % j == 0) {
        			isPrime = false;
        			break;
        		}
        	}
        	
        	if (isPrime) {
        		answer++;
        	}
        }
        
        return answer;
    }
}