package practice.pratice202305;

import java.util.Scanner;

public class BinarySearchX {

	public static void main(String[] args) {
		/* 
		 * 	20230509
		 *  자료구조화 함께 배우는 알고리즘 입문
		 *  배열 내 동일한 데이터가 있을때 가장 앞의 index 를 찾는 프로그램
		 *  117p
		 *  */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] x = new int[n];
		
		for(int i = 0; i<x.length;) {
			System.out.print("입력하세요 > ");
			int a = sc.nextInt();
			
			if(i == 0) {
				x[i] = a;
				i++;
			}else {
				if(x[i-1] > a) {
					System.out.println("다시 입력하세요!");
					continue;
				}else {
					x[i] = a;
					i++;	
				}
			}
		}
		
		System.out.print("검색할 값을 입력하세요 > ");
 		int b = sc.nextInt();
		
 		int idx = binary(b, x);
 		if(idx == 0) {
 			System.out.println("찾는 값이 없습니다.");
 		}else {
 			System.out.println("찾는 값은 x["+idx+"]번째에 있습니다.");
 		}
		
	}
	private static int binary(int b, int[] x) {
		int result = 0;
		int st = 0;
		int end = x.length;
		
		while(st <= end) {
			int mid = (st + end) / 2;
			if(b == x[mid]) {
				int returndata = mid;
					for(int i = mid-1; i >= st; i--) {
						if(x[mid] == x[i]) {
							returndata = i;
							continue;
						}else {
							break;
						}
					}
				return returndata;
			}else if(b > x[mid]) {
				st = mid + 1;
			}else {
				end = mid-1;
			}
			System.out.println("mid : "+mid+", end :"+end+", st : "+st);
		}
		
		return result;
	}

}
