package Raon_Quiz;

import java.util.Scanner;



public class Solution {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("문자열과 시프트 숫자를 입력해주세요. (ex. ab 2): ");
		String s = sc.next();
		n = sc.nextInt();
		
		 System.out.println(solution(s, n));
		
	}
	
	public static String solution(String s, int n) {
		
		String str2;
		
		if(n>25 || n<0 ) {
			
			str2="시프트는 1이상 25이하의 자연수만 가능합니다.";
			
		}else if(s.length()>=8000) {
			
			str2="문자열은 8000이하입니다.";
			
		}else{
			
			char[] sn = s.toCharArray();
			char[] ch_box = new char[sn.length];
		
			for(int i=0;i<sn.length;i++) {
				
				int a = (byte)sn[i];
		
				ch_box[i] = divide(a,n);
					
			}
	
		str2 = String.valueOf(ch_box);
		
		}
		
		return str2;
		
	}
	
	public static char divide (int a, int n) {
		char ts = 0;
		if(a>=65 && a<=90) {
			if(a+n>90) {
				ts =  (char)(a+n-26);
			}else {
				ts =  (char)(a+n);
			}
		}else if(a>=97 && a<=122) {
			if(a+n>122) {
				ts =  (char)(a+n-26);
			}else {
				ts =  (char)(a+n);
			}
		}else if(a==32) {
			ts = (char)(32);
		}
		
		return ts;
		
	}
	
}
