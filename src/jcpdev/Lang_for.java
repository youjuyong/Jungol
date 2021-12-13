package jcpdev;

import java.util.Scanner;

public class Lang_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
