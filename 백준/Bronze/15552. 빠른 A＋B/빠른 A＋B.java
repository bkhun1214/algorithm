import java.util.*;
import java.io.*;

public class Main{
public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < n; i++) {
			if (i != 0) {
				sb.append("\n");
			}
			
			String[] line = br.readLine().split(" ");
			sb.append(Integer.parseInt(line[0]) + Integer.parseInt(line[1]));
		}
		
		System.out.println(sb.toString());
	}
}