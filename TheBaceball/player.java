package TheBaceball;

import java.util.Scanner;

public class player {
    String pName;
    player (String pName) {
        this.pName = pName;
    }
    public static void main(String[] args) {
        player playerArr[] = new player[]{
        new player("john"), 
        new player("john2"), 
        new player("john3"), 
        new player("john4"), 
        new player("john5"), 
        new player("john6"), 
        new player("john7"), 
        new player("john8"), 
        new player("john9")};
        double swingCount[] = new double[playerArr.length];
        int hitCount[] = new int[playerArr.length];
        double hitAverage[] = new double[playerArr.length];

        for (int inning = 0;inning < 3; inning++) {
            for(int playerNum = 0;playerNum < playerArr.length; playerNum++) {
                System.out.println("현 타석 선수의 이름 : "+playerArr[playerNum].pName);
                System.out.println("현 타석 선수의 안타 횟수 : "+hitCount[playerNum]);
                System.out.println("현 타석 선수의 타율 : "+hitAverage[playerNum]);
                System.out.println();
                for(int round = 0;round < 3; round++) {
                    Scanner sc = new Scanner(System.in);
                    String str1 = sc.nextLine();
                    int number = Integer.parseInt(str1);

                    int randomNum = (int)(Math.random() * 10 + 1);
                    System.out.print(randomNum + " ");

                    
                    // int number = (int)(Math.random() * 10 + 1);
                    // System.out.print(number + " ");

                    swingCount[playerNum] = swingCount[playerNum] + 1;

                    if (randomNum == number) {
                        System.out.print("안타");
                        System.out.println();

                        hitCount[playerNum] = hitCount[playerNum] + 1;
                        hitAverage[playerNum] = hitCount[playerNum]/swingCount[playerNum];
                        break;
                    }

                    System.out.print("아웃");
                    System.out.println();

                    hitAverage[playerNum] = hitCount[playerNum]/swingCount[playerNum];
                }
                System.out.println();
                System.out.println("이후 현 타석 선수의 타율 : "+hitAverage[playerNum]);
                System.out.println("------------------------------------------------");
            }
        }
    }
}