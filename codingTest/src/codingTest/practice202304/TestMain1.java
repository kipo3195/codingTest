package codingTest.practice202304;

import java.util.Scanner;

public class TestMain1 {

	public static void main(String[] args) {

		/*
		 * 자리수 구하는 프로그램 양의 정수를 입력하고 자릿수를 작성하는 프로그램을 작성하세요 
		 * 예를 들어 135라고 입력하면 그 수는 3자리 입니다. 라고 출력하면됩니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int cnt = 1;
		int a = 10;
		boolean flag = true;
		
		do {
			if( N < a ) {
				System.out.println("N 은 "+cnt+"자리 수 입니다.");
				flag = false;
			}else {
				cnt ++;
			}
			a = a * 10;
		}while(flag);
		
	}

}
