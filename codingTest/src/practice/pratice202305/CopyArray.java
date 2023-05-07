package practice.pratice202305;

import java.util.Scanner;

public class CopyArray {

	/* 
	 * 	20230507
	 *  자료구조화 함께 배우는 알고리즘 입문
	 *  배열 복사 64p
	 *  */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[sc.nextInt()];
		int b[] = new int[a.length];

		for(int i = 0; i <a.length; i++) {
			
			a[i] = sc.nextInt();
		}
		
		copy(a, b);
		for(int i = 0; i< b.length; i++) {
			System.out.println(b[i]);
		}
		
	}
	
	static void copy(int[] a, int[] b) {
		for(int i = 0; i < a.length; i++){
			b[i] = a[i];
		}
	}

	
}
