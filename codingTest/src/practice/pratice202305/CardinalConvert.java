package practice.pratice202305;

import java.util.ArrayList;
import java.util.Scanner;

public class CardinalConvert {
	
	/* 
	 * 	20230507
	 *  자료구조화 함께 배우는 알고리즘 입문
	 *  진수 변환 프로그램 생성
	 *  70p
	 *  */

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("10진수를 기수 변환 합니다.");
		System.out.print("변환하는 음이아닌 정수 : ");
		int a = sc.nextInt();
		System.out.print("어떤 진수로 변환할까요?(2~36) : ");
		int b = sc.nextInt();
		System.out.println("");
		
		ArrayList<String> list= convert(a, b);
		
		System.out.print(b+"진수로 ");
		for(int i = list.size()-1; i >= 0;i--) {
			System.out.print(list.get(i)+"");
		}
		System.out.print("입니다");
	}
	static ArrayList<String> convert(int a, int b) {

		ArrayList<String> list = new ArrayList<>();
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.print(b+"|______"+a);
		System.out.println("");
		while(a > 0) {
			if(a/b == 0) {
				System.out.println("         "+a/b+"..."+(dchar.charAt(a%b)));
			}else {
				System.out.print(b+"|______"+a/b+"..."+(dchar.charAt(a%b)));
				System.out.println("");
			}
			list.add(dchar.charAt(a%b)+"");
			a = a/b;
		}
		//System.out.print(b+"|______"+a+"...");
		return list;
	}
	
}
