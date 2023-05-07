package practice.pratice202305;

import java.util.Scanner;

public class LeftDays {
	
	/* 
	 * 	20230507
	 *  자료구조화 함께 배우는 알고리즘 입문
	 *  해당 년 월 일을 입력받아 해당 해의 남은 일 수 구하기
	 *  */
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.printf("해당 해의 남은 일 수를 구합니다.\n");
		int y = sc.nextInt();
		int m = sc.nextInt()-1;
		int d = sc.nextInt();

		System.out.printf("해당 해는 %d일 남았습니다..\n", 365 - (d+dayOfYear(y, m)));
		
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
