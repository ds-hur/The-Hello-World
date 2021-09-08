package com.javalec.base;

import java.util.Random;
import java.util.Scanner;

import jdk.internal.misc.FileSystemOption;

public class Warrior_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 5. Moderna Warrior ver.1
		// -------------------------------------------------------

		// 아래의 그림과 같이 고객의 입금, 출금 및 현황을 관리하는 Program을 작성하라
		// 단, 고객명은 1,2,3,4,5
		Scanner scanner = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);

		// 변수 선언
		int inputNumber = 0;
		String userID = "";
		int customerNumber = 0;
		String[] userNames = { "USER_01", "USER_02", "USER_03", "USER_04", "USER_05", "USER_06", "USER_07", "USER_08",
				"USER_09", "USER_10" };
		int[] score = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, };
		int[] userNumber = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int count = 0; // 사용자 성공횟수

		while (inputNumber != 5) {

			System.out.println("1. Moderna Warrior Intro");
			System.out.println("2. 사용자 입력");
			System.out.println("3. 게임 실행");
			System.out.println("4. 점수 현황");
			System.out.println("5. 종료");

			System.out.println("번호를 선택하세요! ");
			inputNumber = scanner.nextInt();

			switch (inputNumber) {

			case 1:
				System.out.println(" >>> Warrior Intro <<<");
				System.out.println("____    __    ____  ___      .______      .______       __    ______   .______      \n"
						+ "\\   \\  /  \\  /   / /   \\     |   _  \\     |   _  \\     |  |  /  __  \\  |   _  \\     \n"
						+ " \\   \\/    \\/   / /  ^  \\    |  |_)  |    |  |_)  |    |  | |  |  |  | |  |_)  |    \n"
						+ "  \\            / /  /_\\  \\   |      /     |      /     |  | |  |  |  | |      /     \n"
						+ "   \\    /\\    / /  _____  \\  |  |\\  \\----.|  |\\  \\----.|  | |  `--'  | |  |\\  \\----.\n"
						+ "    \\__/  \\__/ /__/     \\__\\ | _| `._____|| _| `._____||__|  \\______/  | _| `._____|\n"
						+ "                                                                                    ");
				break;

			case 2:
				System.out.println(" __    __       _______. _______ .______      \n"
						+ "|  |  |  |     /       ||   ____||   _  \\     \n"
						+ "|  |  |  |    |   (----`|  |__   |  |_)  |    \n"
						+ "|  |  |  |     \\   \\    |   __|  |      /     \n"
						+ "|  `--'  | .----)   |   |  |____ |  |\\  \\----.\n"
						+ " \\______/  |_______/    |_______|| _| `._____|\n"
						+ "                                              ");
				System.out.println();
				System.out.println("원하시는 고객번호를 입력하세요(1~10번 사이) : ");
				customerNumber = scanner.nextInt();
				System.out.println("원하시는 ID를 입력하세요 : ");
				userID = scan.nextLine();
				userNames[customerNumber - 1] = userID;
				System.out.println("ID : " + userID + " 님 환영합니다!");
				System.out.println("----------------------------");
				break;

			case 3:
				System.out.println("     _______.___________.    ___      .______     .___________.\n"
						+ "    /       |           |   /   \\     |   _  \\    |           |\n"
						+ "   |   (----`---|  |----`  /  ^  \\    |  |_)  |   `---|  |----`\n"
						+ "    \\   \\       |  |      /  /_\\  \\   |      /        |  |     \n"
						+ ".----)   |      |  |     /  _____  \\  |  |\\  \\----.   |  |     \n"
						+ "|_______/       |__|    /__/     \\__\\ | _| `._____|   |__|     \n"
						+ "                                                               ");
				System.out.println();
				int start = 0;
				System.out.println("1.게임 시작 2. 종료");
				start = sc.nextInt();
				while (start == 1) {
					System.out.println("1.구구단 시작 2. 마지막 문제 후 종료");
					start = sc.nextInt();
					Random random = new Random();
					int i = random.nextInt(9) + 1;
					
					Random random1 = new Random();
					int k = random1.nextInt(9) + 3;
					
					System.out.println(i + "*" + k + "=  ???");
					int result = i * k;
					int respons = sc.nextInt();
					
					if (result == respons) {
						System.out.println("맞추셨습니다!");
						System.out.println(">>>>>>> 다음문제 <<<<<<<");
						count++;
						score[customerNumber-1] = score[customerNumber-1] + 10;
					}
					else if(result != respons) {
						System.out.println("틀렸습니다!!");
						break;
					}
					if (start == 2) {
						break;
					}
				}

			case 4:
				System.out.println("     _______.___________.    ___   .___________. __    __       _______.\n"
						+ "    /       |           |   /   \\  |           ||  |  |  |     /       |\n"
						+ "   |   (----`---|  |----`  /  ^  \\ `---|  |----`|  |  |  |    |   (----`\n"
						+ "    \\   \\       |  |      /  /_\\  \\    |  |     |  |  |  |     \\   \\    \n"
						+ ".----)   |      |  |     /  _____  \\   |  |     |  `--'  | .----)   |   \n"
						+ "|_______/       |__|    /__/     \\__\\  |__|      \\______/  |_______/    \n"
						+ "                                                                        ");
				System.out.println();
				System.out.println("**ID**\t" + "**SCORE**");
				System.out.println("------\t" + "---------");
				for (int i = 0; i < 10; i++) {
					System.out.println(userNames[i] + "\t" + score[i]);
				}
				System.out.println("----------------------------");
				break;
			}
		}
		System.out.println("  _______   ______     ______    _______     .______   ____    ____  _______ \n"
				+ " /  _____| /  __  \\   /  __  \\  |       \\    |   _  \\  \\   \\  /   / |   ____|\n"
				+ "|  |  __  |  |  |  | |  |  |  | |  .--.  |   |  |_)  |  \\   \\/   /  |  |__   \n"
				+ "|  | |_ | |  |  |  | |  |  |  | |  |  |  |   |   _  <    \\_    _/   |   __|  \n"
				+ "|  |__| | |  `--'  | |  `--'  | |  '--'  |   |  |_)  |     |  |     |  |____ \n"
				+ " \\______|  \\______/   \\______/  |_______/    |______/      |__|     |_______|\n"
				+ "                                                                             ");

	}

}
