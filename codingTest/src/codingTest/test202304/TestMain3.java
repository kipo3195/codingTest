package codingTest.test202304;

import java.util.Random;
import java.util.Scanner;

public class TestMain3 {
	
	/* 배열 역순 정렬 2023 04 24*/

	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(n*10); 
		}
		
		for(int i = 0; i <arr.length / 2; i++) {
			int a = arr[i];
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr[j]+" ");
			}
			System.out.println();
			
			arr[i] = arr[n-i-1];
			arr[n-i-1] = a;
			System.out.println("arr["+i+"] 와 arr["+(n-i-1)+"]을 교환 합니다.");
			
			if(i == arr.length/2 - 1) {
				System.out.println("역순 정렬을 마쳤습니다.");
			}
		}
	}

}
