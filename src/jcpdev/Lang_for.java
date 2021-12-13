package jcpdev;

import java.util.Scanner;

public class Lang_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//0 부터 100 까지의 정수를 계속 입력받다가 범위를 벗어나는 수가 입력되면 그 이전까지 입력된 자료의 합계와 평균을 출력하는 프로그램을 작성하시오.
		//(평균은 반올림하여 소수 첫째자리까지 출력한다.)
		
		Scanner sc = new Scanner(System.in);
		
		int sum=0;
		int cnt=0;
		boolean result = true;
		int num;
		
		while(result) {
			num = sc.nextInt();
			
			if(num>100 || num<0) break;
			sum +=num;
			cnt++;
		}
		System.out.println("sum : "+sum);
		System.out.printf("avg : %.1f",sum/(float)cnt);
	}

}
