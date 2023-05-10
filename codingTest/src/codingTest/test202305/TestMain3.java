package codingTest.test202305;

import java.util.Scanner;

public class TestMain3 {

	public static void main(String[] args) {

		/* [2023.05.10] 백준 - 4344 */
		
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		String print[] = new String[N];
		int j = 0;
		while(j < N) {
			int a[] = new int[Integer.parseInt(sc.next())];
					
			int sum = 0;
			for(int i = 0; i < a.length; i++) {
				int b = sc.nextInt();
				a[i] = b;
				sum += b;
			}
			
			int avg = sum / a.length;
			int cnt = 0;
			for(int i = 0; i < a.length; i++ ) {
				if(a[i] > avg) {
					cnt++;
				}
			}
			print[j] = String.format("%.3f",((double)cnt / (double)a.length) * 100);
			j++;
		}
		for(int i = 0; i < print.length; i++) {
			System.out.println(print[i]+"%");
		}
		
	}

}
