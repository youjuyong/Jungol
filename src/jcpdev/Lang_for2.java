package jcpdev;

import java.util.Scanner;

public class Lang_for2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0 이 입력될 때까지 정수를 계속 입력받아 3의 배수와 5의 배수를 제외한 수들의 개수를 출력하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in); //입력 클래스 Scanner
		boolean result = true;
		
		int cnt=0;
		
		while(result) {
			int num = sc.nextInt();
			if(num%3!=0 && num%5!=0) { //입력 값이 3과 5의 배수가 아닐때 cnt증가
				++cnt;
				continue;
			}else if(num==0) {
				result = false;
			}else {
				continue;
			}
		}
		System.out.println(cnt);
	}

}
