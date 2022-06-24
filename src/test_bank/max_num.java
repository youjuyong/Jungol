package test_bank;


import java.util.Scanner;

public class max_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 9개의 서로 다른 자연수가 주어질 때 이들 중 최대값을 찾고 그 최대값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
		// 첫 째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.
		
		Scanner sc = new Scanner(System.in);
		int max = 0;
		
		int[] max_num = new int[9]; 
		int leg = 0;
		int size = max_num.length;
		int num =0;;
		
		for(int i = 0; i <size; i++) {
			 num = sc.nextInt(); 
			 max_num[i] = num;
			 
			 if(num >=100) {
				 System.out.println("100보다 작은수를 입력해주세요.");
				 break;
			 }
			 if(i==0) {
				 max = max_num[i];
				 leg = 0;
			 }else {
				 for(int n=1;n<size;n++) {
					 if(max_num[n]>max) {
						 max = max_num[n];
						 leg = n+1;
					 }
			 	}
			 }		 
					 
		}
		
		System.out.println("최댓값 : " + max);
		System.out.println(leg + " 번째값 " + max +" 가 최댓값입니다  ");
		
	
	}

}
