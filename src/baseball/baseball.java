package baseball;

import java.util.Random;
import java.util.Scanner;

public class baseball {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int com1 = rand.nextInt(10);
		int com2 = rand.nextInt(10);
		while (com1 == com2) {
			com2 = rand.nextInt(10);
		}
		int com3 = rand.nextInt(10);
		while (true) {
			if (com1 != com3) {
				if (com2 != com3) {
					break;
				}
			}
		}
		com3 = rand.nextInt(10);
		System.out.println("===숫자 야구 게임===");

		while (true) { 

			
			System.out.println("1~9중에 세개의 숫자를 입력하세요.");
			int me1 = sc.nextInt();
			int me2 = sc.nextInt();
			int me3 = sc.nextInt();
			int strike = 0; 
			int ball = 0; 
			int nothing = 0; 
			if (me1 == com1)
				strike++;
			if (me2 == com2)
				strike++;
			if (me3 == com3)
				strike++;
			if (strike == 3) {
				System.out.print("<정답>");
				System.out.print("컴퓨터가 생각한 수는" + com1 + com2 + com3+"입니다. ");

				break; 
			}
			if (me1 == com2 || me1 == com3)
				ball++;
			if (me2 == com1 || me2 == com3)
				ball++;
			if (me3 == com1 || me3 == com2)
				ball++;
			nothing = 3 - strike - ball;
			System.out.println("STRIKE: " + strike + " /BALL: " + ball + " /OUT: " + nothing);
		}
		
		sc.close();
		
	}
	
}
