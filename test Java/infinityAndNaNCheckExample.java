public class infinityAndNaNCheckExample {
    public static void main(String[] args) {
        int x = 5;
        double y = 0.0;
        double z = x / y;
        // double z = x % y;
        // 에러가 나오는 코드
        
        System.out.println(z + 2);

        //올바은 코드
        if(Double.isFinite(z) || Double.isNaN(z)) {
            System.out.print("값 산출 불가");
        } else {
            System.out.println(z + 2);
        }
    }
}
