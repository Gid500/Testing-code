package example03;

import java.util.Scanner;

public class Rulette {

	final String MACHINEID = "250410923";
	final String LOCATION = "Cheonan-City";
	int totalPoint = 0;
	int successCount = 0;
	int failCount = 0;
	static int leftOverChance = 0;
	static int income = 0;

	int getChance(int cash){
		Rulette.leftOverChance = cash / 500;
		income += cash;
		return Rulette.leftOverChance;
	}

	int startGame(int chance) {

		for(int i = chance;i > 0; i--){

			System.out.print("나온 룰렛의 번호는");
			int rnd = (int) (Math.random() * 6 + 1);
			System.out.print(" " + rnd);
			if(rnd <= 4) {

				System.out.print(" 성공");
				this.successCount = successCount + 1;

			} else {

				System.out.print(" 실패");
				this.failCount = failCount + 1;
			}

			System.out.print(" 입니다.\n");
		}

		System.out.println("성공 횟수는: " + this.successCount);
		System.out.println("실패 횟수는: " + this.failCount);
		System.out.println("게임을 종료합니다.");
		this.successCount = 0;
		this.failCount = 0;
		return Rulette.leftOverChance = 0;
		
	}
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			Rulette rulette = new Rulette();
			int commend = 0;
			
				
			while (commend <= 2) {
				String menu = "메뉴 조작 목록\n 1.충전, 2.게임시작, 3.마감";
				System.out.println(menu);
				String str1 = sc.nextLine();
				commend = Integer.parseInt(str1);
				switch (commend) {
					case 1:
					System.out.print("충전하실 금액을 입력해 주세요: ");
					String str2 = sc.nextLine();
					int cash = Integer.parseInt(str2);
					if (cash >= 1000 && cash % 1000 == 0) {
						rulette.getChance(cash);
					} else {
						System.out.println("1000원 단위만 투입해 주세요");
					}break;
					case 2:
					if (Rulette.leftOverChance != 0){
						System.out.println("게임을 시작합니다.");
						rulette.startGame(Rulette.leftOverChance);
					} else {
						System.out.println("잔여 횟수가 없습니다.");
					} break;
					case 3:
					if(Rulette.leftOverChance != 0) {
						System.out.println("잔여 포인트가 남아있습니다.");
						commend = 0;
					} else {
						System.out.println("마감합니다.");
						System.out.println("수익은 : " + Rulette.income);
					} break;
					default: break;
				}
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}