package codingTest.test202305;

import java.util.Scanner;

public class TestMain5 {

	/* [2023.05.14] 백준 - 1316 
	 * 그룹 단어 체커 */
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int cnt = 0;
		// 문자 배열 완성 
		for(int i = 0; i < N; i ++) {
			String a = sc.next();
			int pointer = 0; // 현재 비어있는 배열의 순서 
			boolean flag = true;
			char[] arr = new char[a.length()];
			
			for(int j = 0; j < a.length(); j++) {
				if(j == 0) {
					arr[j] = a.charAt(j);
					pointer++;
				}else {
					if(arr[pointer-1] == a.charAt(j)) {	
						//연속된 문자라면 pass
						continue;
					}else {
						//연속 되지 않을때 체크 
						for(int k = 0; k < pointer-1; k++) {
							// 포인터 이전(직전)보다 더 이전 데이터들과 비교
							if(arr[k] == a.charAt(j)){
								flag = false;
								break;
							}
						}
						if(flag) {
							//이전에 나온적 없는 신규 문자
							arr[pointer] = a.charAt(j);
							pointer = pointer +1;
						}
					}
				}
			}
			if(flag) {
				cnt ++;
			}
		}
		System.out.println(cnt);
	}
}
