package practice.pratice202305;

import java.util.Scanner;

public class Days {
	
	/* 
	 * 	20230507
	 *  자료구조화 함께 배우는 알고리즘 입문
	 *  해당 년 월 일이 그 해의 몇번째 날인지 구하기 83p
	 *  */
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.printf("그 해의 경과 일 수 를 구합니다.");
		int y = sc.nextInt();
		int m = sc.nextInt()-1;
		int d = sc.nextInt();

		System.out.printf("그 해의 %d 일째 입니다.\n", d+dayOfYear(y, m));
		
	}
	
	static int isLeaf(int a) {
		return (a % 4 == 0 && a % 100 !=0 || a % 400 == 0) ? 1:0;
	};
	
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};
	
	static int dayOfYear(int y, int m) {
		int day = 0;
		
		while(m > 0) {
			day += mdays[isLeaf(y)][m];
			m--;
		}
		
		return day;
	}
	
}
