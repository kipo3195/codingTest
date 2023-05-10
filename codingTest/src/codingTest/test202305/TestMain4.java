package codingTest.test202305;

import java.util.Scanner;

public class TestMain4 {

	/* [2023.05.10] 백준 - 2941 */
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		
		int cnt = 0;
		for(int i = 0; i < word.length();) {

			if(word.charAt(i) == 'd') {
				if((i+1 < word.length() && word.charAt(i+1) == 'z' ) && (i+2 < word.length() && (word.charAt(i+2) == '=' ))) {
					++cnt;
					i = i+3;
					continue;
				}else if(((i+1 < word.length()) && (word.charAt(i+1) == '-'))) {
					++cnt;
					i = i+2;
					continue;
				}
			}else if(word.charAt(i) == 'c' || word.charAt(i) == 'd' || word.charAt(i) == 's' || word.charAt(i) == 'z') {
				if((word.charAt(i) == 'c') && (i+1 < word.length()) && ((word.charAt(i+1) == '-') || (word.charAt(i+1) == '='))) {
					++cnt;
					i = i+2;
					continue;
				}else if((word.charAt(i) == 'd') && ((i+1 < word.length()) && (word.charAt(i+1) == '-'))) {
					++cnt;
					i = i+2;
					continue;
				}else if(((word.charAt(i) == 's') || (word.charAt(i) == 'z')) && ((i+1 < word.length()) && (word.charAt(i+1) == '='))) {
					++cnt;
					i = i+2;
					continue;
				}

			}else if(word.charAt(i) == 'l' || word.charAt(i) == 'n') {
				if((i+1 < word.length() && (word.charAt(i+1) == 'j'))) {
					++cnt;
					i = i+2;
					continue;
				}
			}
			++cnt;
			i = i + 1;
		}
		System.out.println(cnt);
	}
}
