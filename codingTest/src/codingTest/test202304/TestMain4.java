package codingTest.test202304;

import java.util.Scanner;

public class TestMain4 {

	/*	메모리	시간  언어	코드길이
	 *  13092	120	Java 8 	791	
	 *  2023 05 02 해결
	 */	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		
		int[] base = new int[N];
		for (int i = 1; i<=base.length;i++) {
			base[i-1] = i;
		}
		for(int i = 0; i < M; i++) {
			int s = Integer.parseInt(sc.next())-1;
			int e = Integer.parseInt(sc.next())-1;
			int m = Integer.parseInt(sc.next())-1;
			
			if(s == m) {
				continue;
			}else {
				for(int j = m; j<=e; j++) {
					int temp = base[j];
					for(int k = j; k > s; k--) {
						base[k] = base[k-1];
						if(k-1 == s) {
							base[s] = temp;
							s++;
						}
					}
				}
			}
		}
		for(int i = 0; i < base.length; i++) {
			System.out.print(base[i]+" ");
		}
	}
}
