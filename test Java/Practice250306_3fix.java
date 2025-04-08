
import java.util.Scanner;

public class Practice250306_3fix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        int num1 = Integer.parseInt(str1);

        while(0 < num1){
            int even = num1 % 2;
            num1 /= 2;
            System.out.print(even);
        }
    }
}
