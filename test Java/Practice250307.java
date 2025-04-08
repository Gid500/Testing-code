import java.util.Random;
import java.util.Scanner;

public class Practice250307 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random dice = new Random();
        
        char rpc1[] = {'0', '1', '2'};        // 0 = 가위 < 1 = 바위 < 2 = 보 < 0 = 가위;
        
        String str1 = sc.nextLine();
        char cha1 =  str1.charAt(0);     // String 첫번째만 char로 변환

        char rand = rpc1[dice.nextInt(3)];
        System.out.println(rand);
        
        sc.close();
        
        if(cha1 == rand){
            System.out.println("비김");
        } else switch (cha1) {
            case '0' -> System.out.println(rand == '1' ? "패배":"승리");
            case '1' -> System.out.println(rand == '2' ? "패배":"승리");
            case '2' -> System.out.println(rand == '0' ? "패배":"승리");
            default -> System.out.println("0, 1, 2 이상의 숫자입니다"); 
        }
    }
}
