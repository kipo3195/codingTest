package practice.pratice202305;

import java.util.Scanner;

public class GreatesCommonDivisorByArray {
	
	/* 
	 * 	20230514
	 *  자료구조화 함께 배우는 알고리즘 입문
	 *  배열에 있는 모든 요소의 최대 공약수 구하기
	 *  */
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] array = new int[N];
		
		// 배열에 숫자 받기
		for(int i=0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		// 두 수 x의 최대 공약수는 x,y로 사각형을 만들때, 모든 사각형이 
		// 정사각형되었을때의 한 변의 길이와 같다.
		
		//
		for(int i = 1; i < array.length; i++) {
			System.out.println(i+"번째");
			array[0] = gcd(array[0], array[i]); 
			System.out.println("array"+i+"번째"+ array[0]);
		}
		
		System.out.println("배열의 모든 요소의 최대 공약수는 "+array[0]+"입니다.");
		
	}

	private static int gcd(int i, int j) {
		int result = 0;
		 if(j == 0) {
			return i;
		}else {
			if(i > j) {
				result = gcd(j, i % j);
				System.out.println("j :"+j+", i : "+i+", result"+result);
			}else if(i < j){
				result = gcd(i, j % i);
				System.out.println("i :"+i+", j : "+j+", result"+result);
			}else {
				return i;
			}
		}
		return result;
	}
	
}
