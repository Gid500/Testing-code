public class Practice250304_26 {
    public static void main(String[] args) {
        float middium, large, pi;
        middium = 20f;
        large = 30f;
        pi = 3.141592f;
        
        double large1 = Math.pow(large, 2)*pi;
        double middium1 = (Math.pow(middium, 2)*pi)*2;

        String result1 = String.format("%.3f", middium1);
        String result2 = String.format("%.3f", large1);

        System.out.println("20cm 피자 2개의 면적은" + result1);
        System.out.println("30cm 피자 1개의 면적은" + result2);

        String pizza = middium1 < large1 ?
        "30cm 피자 1개를 주문 하는 게 더 좋아요" : "20cm 피자 2개를 주문 하는 게 더 좋아요";

        System.out.println(pizza);
    }
}