package test_bank;

import java.util.Scanner;

public class multiplication_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int start_num=0;
		int final_num=0;
		
		Scanner sc = new Scanner(System.in);
		start_num = sc.nextInt();
		final_num = sc.nextInt();
		
		if(start_num<final_num) {
			
			for(int j=start_num;j<=final_num;j++) {

				for(int i=1;i<10;i++) {
					if(i%3==0) {
						System.out.printf("%d * %d = %2d  " ,j,i,(j*i));
						System.out.println();
					}else{
						System.out.printf("%d * %d = %2d  " ,j,i,(j*i));
						System.out.printf(" ");
					}
				}

				System.out.println();
			}
		}else if(start_num>final_num) {
			
			for(int j=start_num;j>=final_num;j--) {

				for(int i=1;i<10;i++) {
					if(i%3==0) {
						System.out.printf("%d * %d = %2d  " ,j,i,(j*i));
						System.out.println();
					}else{
						System.out.printf("%d * %d = %2d  " ,j,i,(j*i));
						System.out.printf(" ");
					}
				}

				System.out.println();
			}
		}else {
			for(int i=1;i<10;i++) {
				if(i%3==0) {
					System.out.printf("%d * %d = %2d  " ,start_num,i,(start_num*i));
					System.out.println();
				}else{
					System.out.printf("%d * %d = %2d  " ,start_num,i,(start_num*i));
					System.out.printf(" ");
				}
			}
		}
	
	
	}

}
