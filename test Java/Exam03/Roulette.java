package Exam03;
import java.util.Scanner;

public class Roulette {
    String machineName;
    String locationName;
    int sucessCount;
    int failedCount;
    int totalPoint;

    static int leftChance = 0;
    static int income = 0;
    // 룰렛의 생성자
    Roulette() {
        this.machineName = "250411922";
        this.locationName = "unknown";
        this.sucessCount = 0;
        this.failedCount = 0;
        this.totalPoint = 0;
    }
    // 메뉴 메서드
    void menu(){
        System.out.println("1.충전 2.게임시작 3.마감");
    }

    void chargeCash() {
        Scanner sc = new Scanner(System.in);
        String str2 = sc.nextLine();
        int cmoney = Integer.parseInt(str2);
        System.out.println(
            cmoney >= 1000 && cmoney % 1000 == 0 ? 
        "충전된 횟수는 " + (Roulette.leftChance += cmoney/500) + "입니다.":"1000원 단위로 돈을 넣어주세요.");
    }

    String startGame(){
        for(int i = 0;i < Roulette.leftChance; i++){
            int rouletteNum = (int)(Math.random()*6) + 1;
            if (rouletteNum <= 4) {
                System.out.println("나온 번호는 " + rouletteNum + " 성공");
                ++sucessCount;
                totalPoint += rouletteNum;
            } else {
                System.out.println("나온 번호는 " + rouletteNum + " 실패");
                ++failedCount;
            }
        }
        
        String result = "성공 횟수는 : " + sucessCount + "\n실패 횟수는 : " + failedCount + "\n종합 점수는 : " + totalPoint;
        sucessCount = 0;
        failedCount = 0;
        totalPoint = 0;
        return result;
    }
    public static void main(String[] args) {
        Roulette roulette = new Roulette();
        try (Scanner sc = new Scanner(System.in)) {
            int command = 0;
            
            while(command < 3){
                roulette.menu();
                String str1 = sc.nextLine();
                int num1 = Integer.parseInt(str1);
                command = num1;
                switch (command) {
                    case 1:
                        roulette.chargeCash();
                    break;
                    case 2:
                        System.out.println(
                            Roulette.leftChance != 0 ?
                        roulette.startGame():"잔여 횟수가 없습니다 충전해주세요.");
                    break;
                    case 3:
                        if (Roulette.leftChance > 0) {
                            System.out.println("잔여 횟수가 " + Roulette.leftChance + " 남았습니다");
                            command = 0;
                        } else {
                            System.out.println("기기 수익은 " + Roulette.income + " 마감합니다");
                        };
                    break;
                    default: break;
                }
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}