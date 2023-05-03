package codingTest.practice202305;

import java.util.Scanner;

public class TestMain1 {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int b = a.getBytes().length;
		
		int result = 1;
		
		for(int i = 0; i < (b/2); i++ ) {
			char c = a.charAt(i);
			char d = a.charAt(b-1-i);
			if(c == d) {
				if(i == (b/2)-1 ) {
					result = 1;
				}
			}else {
				result = 0;
				break;
			}
		}
		System.out.println(result);
		
	}
	
}
