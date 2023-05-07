package codingTest.test202304;

import java.util.Scanner;

public class TestMain2 {

	
	public static void main(String[] args) {
		
		/* n단의 피라미드를 출력하는 소스를 작성하여라. */
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			for(int j = 1; j <= (2*N)-1; j++) {
				
				if(j < N - i) {
					System.out.print(" ");
					
				}else {
					if(j-N > i) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
				
				}
			}
			System.out.println();
		}
		
		
		
		
	}
	
	
	
}
