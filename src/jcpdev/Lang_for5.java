package jcpdev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lang_for5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//리스트에 있는 숫자들의 중앙값을 구하는 프로그램을 만들어라.
		// [7, 9, 14] = 9
		// [24, 31, 35, 49] = 33
		// [17, 37, 37, 47, 57] = 37
		//중앙값 : 자료를 작은 값에서부터 크기순으로 나열할 때 중앙에 위치한 값
		//① 자료의 개수가 홀수이면 가운데 위치한 값이 중앙값이다.
		//② 자료의 개수가 짝수이면 가운데 위치한 두 값의 평균이 중앙값이다.
		
		Scanner scan = new Scanner(System.in);

		String[] input = scan.nextLine().split(",");
		
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(input));
		
		if(list.size()%2==1) {
			
			int odd_result = 0;
			odd_result = (( 1 + list.size() ) / 2 ) - 1;
			int list_result = Integer.parseInt(list.get(odd_result));
			System.out.println("중앙값 = " + list_result);
			
		}else if(list.size()%2==0) {
			
			int even_result_start = list.size()/2;
			int even_result_final = even_result_start+1;
			
			int list_result_even1 = Integer.parseInt(list.get(even_result_start-1));
			int list_result_even2 = Integer.parseInt(list.get(even_result_final-1));
		
			int avg = (list_result_even1 + list_result_even2) / 2;
			
			System.out.println("중앙값 = " + avg);
		}
		
	}

}
