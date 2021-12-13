package jcpdev;

import java.util.Scanner;

public class Lang_for3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//삼각형의 밑변의 길이와 높이를 입력받아 넓이를 출력하고, "Continue? "에서 하나의 문자를 입력받아 그 문자가 'Y' 나 'y' 이면 작업을 반복하고 다른 문자이면 종료하는 프로그램을 작성하시오.

		//(넓이는 반올림하여 소수 첫째자리까지 출력한다.)​
		
		Scanner sc = new Scanner(System.in);
		boolean result = true;
		
		while(result) {
			System.out.printf("Base = "); //밑변
			int Base = sc.nextInt();
			
			System.out.printf("Height = "); // 높이
			int Height = sc.nextInt();
		
			float width = ((float)Base * (float)Height)/2; //삶각형 넓이
			System.out.printf("Triangle width = %.1f\n",width);
			
			System.out.printf("Continue? ");
			String response = sc.next();
		
			if(response.equals("Y") || response.equals("y")) {
				continue;
			}else if(response.equals("N")) {
				result = false;
			}
			
		}
		
	}
}
