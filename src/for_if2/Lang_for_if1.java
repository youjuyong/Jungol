package for_if2;

import java.util.Scanner;

public class Lang_for_if1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//홀수와 짝수의 개수를 구하는 프로그램을 구하라.
		//[3, 4, 5, 6, 7]
		//= 홀수 3개, 짝수 2개
		
		Scanner scan = new Scanner(System.in);
		int odd = 0; // 홀수
		int even = 0; // 짝수
		int num;
		
		for(int i = 0; i < 5; i++) {
			num = scan.nextInt();
			if(num % 2 ==1) {
				odd += 1;
			}else if(num % 2 ==0) {
				even += 1;
			}
		}
		
		System.out.printf("홀수 : %d 짝수 : %d \n",odd,even);
		
	}
}
