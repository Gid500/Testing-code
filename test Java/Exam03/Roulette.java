package Exam03;
import java.util.Scanner;

public class Roulette {
    String machineName;
    String locationName;
    int sucessCount;
    int failedCount;
    int totalPoint;
    int leftChance;
    int income;

    // 룰렛의 생성자
    Roulette(String machineName, String locationName) {
        this.machineName = machineName;
        this.locationName = locationName; 
        this.sucessCount = 0;
        this.failedCount = 0;
        this.totalPoint = 0;
        this.leftChance = 0;
        this.income = 0;
    }

    // 메뉴 메서드
    void menu(){
        System.out.println("1.충전 2.게임시작 3.마감");
    }

    // 횟수 충전
    void chargeCash() {
        Scanner sc = new Scanner(System.in);
        String str2 = sc.nextLine();
        int cmoney = Integer.parseInt(str2);

        if(cmoney >= 1000 && cmoney % 1000 == 0){
            income += cmoney;
            System.out.println("충전된 횟수는 " + (leftChance += cmoney/500) + "입니다.");
        } else {
            System.out.println("1000원 단위로 돈을 넣어주세요.");
        }
        // +=식으로 사용해서 연속충전시 횟수가 누적된다.  
    }

    // 게임 시작 메서드
    String startGame(){
        for(int i = 0;i < leftChance; i++){
            int rouletteNum = (int)(Math.random()*6) + 1;
            if (rouletteNum <= 4) {
                System.out.println("나온 번호는 " + rouletteNum + " 성공");
                ++sucessCount;
                totalPoint += rouletteNum;
            } else {
                System.out.println("실패");
                ++failedCount;
            }
        }
        String result = "성공 횟수는 : " + sucessCount + "\n실패 횟수는 : " + failedCount + "\n종합 점수는 : " + totalPoint;
        sucessCount = 0;
        failedCount = 0;
        totalPoint = 0;
        leftChance = 0;
        return result;
    }

    // 잔여횟수가 0이 아닐경우 startGame()매서드를 실행 아니면 충전해주세요를 출력
    void flag1() {
        System.out.println(leftChance != 0 ? 
        startGame() : "잔여 횟수가 없습니다 충전해주세요. 메인화면으로 돌아갑니다.");
    }

    int flag2(){
        int temp = 3;
        if(leftChance > 0) {
            System.out.println("잔여 횟수가 " + leftChance + " 남았습니다. 메인화면으로 돌아갑니다.");
            temp = 0;
        } else {
            System.out.println("기기 수익은 " + income + " 마감합니다");
        }
        return temp;
    }
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Roulette roulette = new Roulette("250411922", "unknown");
            int command = 0;
            
            while(command < 3){
                roulette.menu();
                String str1 = sc.nextLine();
                int num1 = Integer.parseInt(str1);
                command = num1;
                switch (command) {
                    case 1 -> roulette.chargeCash();
                    case 2 -> roulette.flag1();
                    case 3 -> command = roulette.flag2() ;
                    default -> {
                        command = 0;
                        System.out.println("3이상의 숫자입니다. 메인화면으로 돌아갑니다");
                    }
                }
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}