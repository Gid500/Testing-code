public class Practice250310 {
    public static void main(String[] args) {
        int numbers = 1000;
        

        for(int i = 0;i < numbers; i++){
            int temp = i + 1;
            int temp1 = (i + 1) % 10;
            int temp2 = (i + 1) % 100;

            int line = i % 10;
            if (line == 0){
                System.out.println();
            }

            if (temp % 330 == 0) {
                System.out.print("짝짝");
                if (temp2 % 10 == 0) {
                    System.out.print("뽀송");
                }
                System.out.print(",");
                continue;
            }

            if (temp2 > 29 && temp2 % 30 < 10) {
                System.out.print("짝");
                if (temp1 != 0 && temp1 % 3 == 0) {
                    System.out.print("짝");
                }
                if (temp2 % 10 == 0) {
                    System.out.print("뽀송");
                }
                System.out.print(",");
                continue;
            }

            if (temp1 != 0 && temp1 % 3 == 0) {
                System.out.print("짝");
                if (temp2 > 29 && temp2 % 30 < 10) {
                    System.out.print("짝");
                }
                if (temp2 == 0) {
                    System.out.print("뽀송");
                }
                System.out.print(",");
                continue;
            }

            

            System.out.print(i + 1);

            if ((i + 1) < numbers) {
                System.out.print(",");
            }
        }


    }
}
