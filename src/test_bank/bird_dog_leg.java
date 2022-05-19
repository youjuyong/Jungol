package test_bank;

import java.util.Scanner;

public class bird_dog_leg {

	public static boolean funtion(int scale,int leg,int dog,int bird) {
		boolean b = true;
		if((4*dog+2*bird)!=leg) {
			b = false;
		}else if((dog+bird)!=scale){
			b = false;
		}else if(dog<0 || bird<0) {
			b = false;
		}else {
			b=true;
		}
		
		return b;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//강아지와 병아리의 합과 다리의 수를 입력받아 강아지와 병아리가 각각 몇 마리씩인지 구하는 프로그램을 작성하시오. 
		//강아지와 병아리의 합 1000 이하 다리의 합 4000 이하의 음이 아닌 정수가 공백으로 구분하여 입력된다. 하나의 결과가 나온 후에도 계속 새로운 입력을 받다가 0 0 이 입력되면 프로그램을 종료한다.
		
		
		int dog;
		int bird;
		int scale;
		int leg;
		
		boolean a = true;
		int dogleg;
		int birdleg;
		Scanner sc = new Scanner(System.in);
		
		while(a) {
			scale = sc.nextInt();
			leg = sc.nextInt();
		
			bird = (4*scale-leg)/2;
			dog = scale -bird;
		
			if(scale >1000 || leg > 4000) {
				System.out.println("INPUT ERROR!");
			}else if(funtion(scale,leg,dog,bird)==false){
				System.out.println("0");
			}else if(scale ==0 && leg ==0) {
				a =false;
			}else {
				System.out.printf("%d %d",dog,bird);
				System.out.println();
			}
			
		}
		
		
	}
	
	
}
