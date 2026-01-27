import java.util.*;
public class Main{
    public static String solution(int p, int m, int[] level, String[] nickname) {
		StringBuffer sb = new StringBuffer();
		
		Map<Integer, List<String>> rooms = new HashMap<Integer, List<String>>();
		Map<Integer, Integer> owners = new HashMap<Integer, Integer>();
		int roomCount = 1;
		List<String> firstRoom = new ArrayList<String>();
		firstRoom.add(nickname[0]);
		rooms.put(1, firstRoom);
		owners.put(1, level[0]);
		
		for (int i = 1; i < p; i++) {
			
			int ready = level[i];
			
			for (int j = 1; j <= roomCount + 1; j++) {
				if (rooms.get(j) != null && rooms.get(j).size() == m) {
					continue;
				}
				
				if (j == roomCount + 1) {
					List<String> newRoom = new ArrayList<String>();
					newRoom.add(nickname[i]);
					rooms.put(j, newRoom);
					owners.put(j, level[i]);
					roomCount++;
					break;
				}
				
				if (owners.get(j)-10 <= ready && owners.get(j)+10 >= ready) {
					List<String> basicRoom = rooms.get(j);
					basicRoom.add(nickname[i]);
					rooms.put(j, basicRoom);
					break;
				}
			}
		}
		
		for (int i = 1; i < roomCount + 1; i++) {
			List<String> room = rooms.get(i);
			
			if (room.size() == m) {
				sb.append("Started!");
			} else {
				sb.append("Waiting!");
			}
			sb.append("\n");
			
			room.sort((s1, s2) -> {
				String nickname1 = s1.split(" ")[1];
				String nickname2 = s2.split(" ")[1];
				
				return nickname1.compareTo(nickname2);
			});
			
			for (int j = 0; j < room.size(); j++) {
				sb.append(room.get(j));
				sb.append("\n");
			}
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int p = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		
		int[] level = new int[p];
		String[] nickname = new String[p];
		
		for (int i = 0; i < p; i++) {
			String line = sc.nextLine();
			level[i] = Integer.valueOf(line.split(" ")[0]);
			nickname[i] = line;
		}
		
		System.out.println(solution(p, m, level, nickname));
	}
}