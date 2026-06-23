import java.util.*;

class Solution {
    public String[] solution(String[] expressions) {

        String[] answer = {};
        
        boolean[] num = new boolean[10];
        Arrays.fill(num, true);
        
        List<String> list = new ArrayList<>();
        int max = 0;
        
        for (int i = 0; i < expressions.length; i++) {
        	String expression = expressions[i];
        	
        	for (char c : expression.toCharArray()) {
        		if (Character.isDigit(c) && max < c - '0') {
        			max = c - '0';
        		}
        	}
        }
        
        for (int i = 0; i < expressions.length; i++) {
        	String expression = expressions[i];
        	
        	if (expression.charAt(expression.length() - 1) == 'X') {
        		list.add(expression);
        	} else {
        		String[] split = expression.split(" ");
        		for (int j = max+1; j < 10; j++) {
        			if (num[j]) {
        				int num1 = Integer.parseInt(split[0], j);
        				int num2 = Integer.parseInt(split[2], j);
        				int result1 = Integer.parseInt(split[4], j);
        				int result2 = split[1].equals("+") ? num1 + num2 : num1 - num2;
        				
        				if (result1 != result2) {
        					num[j] = false;
        				}
        			}
        		}
        	}
        }
        
        answer = new String[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
        	int count = 0;
        	String value = "";
        	
        	String expression = list.get(i);
        	String[] split = expression.split(" ");
        	
        	boolean isTrue = true;
        	for (int j = max+1; j < 10; j++) {
        		if (num[j]) {
        			count++;
                	int num1 = Integer.parseInt(split[0], j);
        			int num2 = Integer.parseInt(split[2], j);
        			
        			int temp = split[1].equals("+") ? num1 + num2 : num1 - num2;
        			String tempValue = Integer.toString(temp, j);
        			
        			if (count > 1) {
        				if (!value.equals(tempValue)) {
        					isTrue = false;
        					break;
        				}
        			} else {
        				value = tempValue;
        			}
        		}
        	}
        	
        	if (isTrue) {
        		expression = expression.replace("X", value);
        	} else {
        		expression = expression.replace("X", "?");
        	}
        	answer[i] = expression;
        }
        
        return answer;
    }
}