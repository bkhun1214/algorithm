import java.util.*;
import java.io.*;

public class Main{
    static Map<String, List<String>> folders;
	static Map<String, List<String>> files;
	static Map<String, Integer> map;
	
	public static String solution(int n, int m, String[] arrs, int k, String[] probs) {
		StringBuffer answer = new StringBuffer();
		folders = new HashMap<>();
		files = new HashMap<>();
		
		for (int i = 0; i < n+m; i++) {
			String[] split = arrs[i].split(" ");
			String p = split[0];
			String c = split[1];
			
			List<String> list;
			
			if (split[2].equals("1")) {
				if (folders.get(p) == null) {
					list = new ArrayList<>();
				} else {
					list = folders.get(p);
				}
				
				list.add(c);
				folders.put(p, list);
				
			} else {
				if (files.get(p) == null) {
					list = new ArrayList<>();
				} else {
					list = files.get(p);
				}
				
				list.add(c);
				files.put(p, list);
			}
		}
		
		for (int i = 0; i < k; i++) {
			if (i != 0) {
				answer.append("\n");
			}
			
			String[] prob = probs[i].split("/");
			
			String p = prob[prob.length - 1];
			
			map = new HashMap<>();
			search(p);

			int names = map.size();
			int count = 0;
			for (String name : map.keySet()) {
				count += map.get(name);
			}
			
			answer.append(names);
			answer.append(" ");
			answer.append(count);
		}
		
		return answer.toString();
	}
	
	public static void search(String p) {
		List<String> folder = folders.get(p);
		List<String> file = files.get(p);
		if (file != null) {
			for (int i = 0; i < file.size(); i++) {
				String name = file.get(i);
				map.put(name, map.getOrDefault(name, 0) + 1);
			}
		}
		
		if (folder != null) {
			for (int i = 0; i < folder.size(); i++) {
				search(folder.get(i));
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		String[] arrs = new String[n+m];
		
		for (int i = 0; i < n+m; i++) {
			arrs[i] = br.readLine();
		}
		
		int k = Integer.parseInt(br.readLine());
		
		String[] probs = new String[k];
		
		for (int i = 0; i < k; i++) {
			probs[i] = br.readLine();
		}
		
		System.out.println(solution(n, m, arrs, k, probs));
	}
}