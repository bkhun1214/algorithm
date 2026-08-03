import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int width = park[0].length() - 1;
        int height = park.length - 1;
        int x = 0;
        int y = 0;
        
        for (int i = 0; i < park.length; i++) {
            int temp = park[i].indexOf("S");
            if (temp != -1) {
                x = i;
                y = temp;
                break;
            }
        }
        
        for (String route : routes) {
            String[] routeSplit = route.split(" ");
            String location = routeSplit[0];
            int distance = Integer.parseInt(routeSplit[1]);
            
            if ("E".equals(location)) {
                if (y + distance > width) {
                    continue;
                }
                
                int temp = 0;
                for (char c : park[x].substring(y, y+distance+1).toCharArray()) {
                    if (c == 'X') {
                        temp = 1;
                        break;
                    }
                }
                
                if (temp == 0) {
                    y += distance;
                }
            } else if ("W".equals(location)) {
                if (y - distance < 0) {
                    continue;
                }
                
                int temp = 0;
                for (char c : park[x].substring(y-distance, y+1).toCharArray()) {
                    if (c == 'X') {
                        temp = 1;
                        break;
                    }
                }
                
                if (temp == 0) {
                    y -= distance;
                }
            } else if ("S".equals(location)) {
                if (x + distance > height) {
                    continue;
                }
                
                int temp = 0;
                for (int j = x; j < x + distance + 1; j++) {
                    if (park[j].charAt(y) == 'X') {
                        temp = 1;
                        break;
                    }
                }
                
                if (temp == 0) {
                    x += distance;
                }
            } else if ("N".equals(location)) {
                if (x - distance < 0) {
                    continue;
                }
                
                int temp = 0;
                for (int j = x; j > x - distance - 1; j--) {
                    if (park[j].charAt(y) == 'X') {
                        temp = 1;
                        break;
                    }
                }
                
                if (temp == 0) {
                    x -= distance;
                }
            }
        }
                    
        int[] answer = {x, y};
        
        return answer;
    }
}