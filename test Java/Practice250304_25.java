
import java.util.Scanner;

public class Practice250304_25 {
    public static void main(String[] args) {
        int pen, box, total;
        int penNum;
        int boxNum;
        Scanner sc = new Scanner(System.in);
        System.out.println("연필의 숫자:");
        penNum = sc.nextInt();
        System.out.println("연필 12개가 들어가있는 박스의 숫자:");
        boxNum = sc.nextInt();
        pen = penNum*1000;
        box = boxNum*(1000*12);
        total = pen + box;
        System.out.println(total);
        sc.close();
    }
}
