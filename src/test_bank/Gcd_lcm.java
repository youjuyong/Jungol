package test_bank;

import java.util.Scanner;

public class Gcd_lcm {
	//첫째 줄에는 입력으로 주어진 두 수의 최대공약수를 둘째 줄에는 입력으로 주어진
	//두 수의 최소 공배수를 출력한다.
	
	public static int get_gcd(int a,int b) {
		if( b == 0) return a;
		else return get_gcd(b,a % b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in);
	
	int a = sc.nextInt();
	int b = sc.nextInt();
	
	int gcd = get_gcd(a,b);
	int lcm = a * b / gcd;
    
    System.out.println(gcd + "\n" + lcm);

	}
}
