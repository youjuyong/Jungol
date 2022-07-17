package test_bank;

import java.util.Scanner;

public class Movie_Tiket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Select_movie;
		String Insert_movie;
		String Back_Check;
		boolean insert_check =true;
		boolean t=true;
		Tiket_Service ts = new Tiket_Service();
		Scanner sc = new Scanner(System.in);
		
		
		
		while(t) {
			
		int i = 0;
		System.out.println("원하시는 서비스를 입력해주세요.(1.영화 조회,2.영화 예매,3.영화 입력)");
		i = sc.nextInt();
		switch(i) {
		
		case 1:
			System.out.println("영화 조회 입니다.");
			System.out.println("원하시는 영화를 입력해주세요 : ");
			Select_movie = sc.next();
			
		case 3:
			while(insert_check) {
			System.out.println("영화 입력입니다.");
			System.out.println("입력하시고 싶으신 영화를 입력해주세요 : ");
			Insert_movie = sc.next();
			ts.Insert_Movie_Service(Insert_movie);
			
			System.out.println("입력 성공!");
			System.out.printf("현재 입력된 영화의 종류 : " + ts.toString());
			
			
			System.out.println();
			System.out.println("메뉴로 돌아가 겠습니까?(Y/N)");
			
			Back_Check = sc.next();
			if(Back_Check.equals("Y")) {
				insert_check=false;
			}else if(Back_Check.equals('N')){
			    insert_check=true;
			 }
			}
			
		case 4:
		}
		
		}
		
		
	}

}
