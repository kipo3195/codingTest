package codingTest.test202305;

import java.util.Scanner;

public class TestMain5Copy {

	/* [2023.05.14] 백준 - 1316 
	 * 그룹 단어 체커 */
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		// 문자 배열 완성 
		for(int i = 0; i < N; i ++) {
			String a = sc.next();
			cnt += wordChecker(a.toLowerCase());
		}
		
		System.out.println(cnt);
	}

	private static int wordChecker(String a) {
		int result = 1;
		char before = 0;
		char[] arr = new char[26];
		
		for(int i = 0; i< a.length(); i++) {
			if( i==0 )  {
				before = a.charAt(i);
				arr[a.charAt(i)-97]++;
			}else {
				if(before != a.charAt(i)) {
					if(arr[a.charAt(i)-97] > 0) {
						return 0;
					}else {
						before = a.charAt(i);
						arr[a.charAt(i)-97]++;
					}
				}
			}
		}
		return result;
	}
}
