import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x,y;
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		int f = Integer.parseInt(st.nextToken());
		
		if (a == 0) {
			y = c / b;
			x = (f - (e * y)) / d;
		} else if (d == 0) {
			y = f / e;
			x = (c - (b * y)) / a;
		} else {
			y = ((c * d) - (a * f)) / ((b * d) - (a * e));
			x = (c - (b * y)) / a;
		}
		
		System.out.println(x + " " + y);
	}
}