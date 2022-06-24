package jcpdev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lang_for6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//입력된 휴대전화 번호 뒤에 4자리를 '*'로 변경하시오.
		//ex.01029663366 -> 0102966****(단, 11자리 숫자가 아니어도 상관없다.)
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		String[] str2;
		str2 = str.split(""); //String 배열 str2에 문자 하나씩 삽입
		
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(str2));
		// list 에 String 배열의 문자 하나씩 삽입
		
		for(int j = 0; j < list.size()-4;j++) {
			list.set(j, "*"); // list 마지막 4글자 제외 모두 "*" 변경 
		}
		
		String str_result = "";
		for(String item : list) { // list를 모두 문자열 변환
			 str_result += item;
		}
		System.out.println(str_result);

		
	}

}
