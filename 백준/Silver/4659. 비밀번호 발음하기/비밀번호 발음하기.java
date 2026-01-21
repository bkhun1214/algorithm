import java.util.*;
public class Main{
    public static void solution(List<String> array) {
		char[] vowel = {'a', 'e', 'i', 'o', 'u'};
		
		for (int i = 0; i < array.size(); i++) {
			String s = array.get(i);
			String answer = String.format("<%s> is acceptable.", s);
			
			char prev = 0;
			int consonantCount = 0;
			int vowelCount = 0;
			boolean isVowelExist = false;
			
			for (char c : s.toCharArray()) {
				if (prev == c && (c != 'e' && c != 'o')) {
					answer = String.format("<%s> is not acceptable.", s);
					break;
				}
				
				boolean isVowel = false;
				for (char v : vowel) {
					if (c == v) {
						isVowel = true;
						vowelCount++;
						consonantCount = 0;
						if (!isVowelExist) {
							isVowelExist = true;
						}
						break;
					}
				}
				
				if (!isVowel) {
					vowelCount = 0;
					consonantCount++;
				}
				
				if (consonantCount == 3 || vowelCount == 3) {
					answer = String.format("<%s> is not acceptable.", s);
					break;
				}
				
				prev = c;
			}
			
			if (!isVowelExist) {
				answer = String.format("<%s> is not acceptable.", s);
			}
			
			System.out.println(answer);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> array = new ArrayList<>();
		
		while (true) {
			String s = sc.nextLine();
			
			if (s.equals("end")) {
				break;
			}
			array.add(s);
		}

		solution(array);
	}
}