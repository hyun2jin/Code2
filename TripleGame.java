package com.hk.app;
import java.util.Random;
import java.util.Scanner;

public class Random2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//어지, 니 , 쌈
		
		Random n1 = new Random();
		
		int s1 = n1.nextInt(50);
		int s2 = s1 % 3;
		String score = "";
		Scanner scan = new Scanner(System.in);

		/*
		//상대가 입력하는 방식
		System.out.print("1Player선택 = ");		
		score = scan.nextLine();
		*/
		
		
		//자동선택방식
		int other = n1.nextInt(3);	
		if(other == 0)
		{
			System.out.println("상대선택 쌈");
			score = "쌈";
		}
		else if(other == 1)
		{
			System.out.println("상대선택 어지");
			score = "어지";
		}
		else if(other == 2)
		{
			System.out.println("상대선택 니");
			score = "니";
		}
		
		
		

		
		
		System.out.print("2Player선택 = ");
		Scanner scan1 = new Scanner(System.in);
		String score1 = scan1.nextLine();		

		
		//데이타 중복체크
		if(score.equals(score1))
		{
			System.out.println("같은항목은 선택할수업습니다");
			return;
		}

//////////////////////////////////////////////////////////////////
		
		//입력된값 계산편하게 수치화
		int p1 = 0;
		int p2 = 0;		
		if(score.equals("어지"))
			p1 = 1;
		else if(score.equals("니"))
			p1 = 2;
		else if(score.equals("쌈"))
			p1 = 0;
		
		if(score1.equals("어지"))
			p2 = 1;
		else if(score1.equals("니"))
			p2 = 2;
		else if(score1.equals("쌈"))
			p2 = 0;
		
////////////////////////////////////////////////////////////////////		

		//구슬결과값을 기준으로 처리한다
		switch(s2)
		{
		case 0:
			
			System.out.println("나온결과값 쌈");
			
			if(p1 == 0)
				System.out.println("1 Player  쌈 승");
			else if(p2 == 0)
				System.out.println("2 Player  쌈 승");
			else
				System.out.println("무승부");			
		break;
		
		case 1:
			
			System.out.println("나온결과값 어지");
			
			if(p1 == 1)
				System.out.println("1 Player  어지 승");
			else if(p2 == 1)
				System.out.println("2 Player  어지 승");
			else
				System.out.println("무승부");			
		break;
		
		case 2:
			
			System.out.println("나온결과값 니");
			
			if(p1 == 2)
				System.out.println("1 Player  니 승");
			else if(p2 == 2)
				System.out.println("2 Player  니 승");
			else
				System.out.println("무승부");			
		break;
		
		}
		
			
			
	}

}
