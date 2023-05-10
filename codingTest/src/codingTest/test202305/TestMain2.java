package codingTest.test202305;

import java.util.Scanner;

public class TestMain2 {

	/* [2023.05.05] 백준 - 1157 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String alpha = (sc.next()).toUpperCase();

		int[] arr = new int[26];

		for(int i = 0; i < alpha.length(); i++) {
			int a = alpha.charAt(i) - 65;
			arr[a] = arr[a]+1;
		}
		
		boolean compare = false;
		char maxAlpha = 65;
		int maxInt = 0;
		for(int i = 1; i < arr.length; i++) {
			if(arr[maxInt] < arr[i]) {
				maxAlpha = (char) (65 + i);
				compare = false;
				maxInt = i;
			}else if((arr[maxInt] == arr[i]) && arr[i] > 0 ) {
				compare = true;
			}
		}
		if(!compare) {
			System.out.println(maxAlpha);
		}else {
			System.out.println("?");
		}
		
		sc.close();
	}
}
