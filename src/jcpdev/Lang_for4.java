package jcpdev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lang_for4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 리스트에 있는 숫자들의 평균을 구하는 프로그램을 만들어라.
		// [4, 6, 8] = 6

		int result = 0;
		
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().split(",");
		
		ArrayList<String> temp = new ArrayList<String>(Arrays.asList(input));
		
		for (int i = 0; i < temp.size(); i++) {
			result += Integer.parseInt(temp.get(i));
		}
		
		System.out.println("Avg : " + result/temp.size());
		scan.close();
		
		
		
	}

}
