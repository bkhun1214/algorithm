import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int[] arrN = new int[n];
        int[] arrM = new int[m];
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arrN[i] = Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            arrM[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arrN);
        Arrays.sort(arrM);
        
        int lt = 0;
        int rt = 0;
        StringBuffer answer = new StringBuffer();
        
        while (lt != n && rt != m) {
        	if (arrN[lt] > arrM[rt]) {
                answer.append(arrM[rt]);
                rt++;
            } else {
                answer.append(arrN[lt]);
                lt++;
            }
        	
        	answer.append(" ");
        }
        
        while (lt != n) {
        	answer.append(arrN[lt]);
        	answer.append(" ");
        	lt++;
        }
        
        while (rt != m) {
        	answer.append(arrM[rt]);
        	answer.append(" ");
        	rt++;
        }
        
        System.out.println(answer.toString());
    }
}