import java.util.Random;

public class Practice250314 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int arr[] = new int[6];
        for(int i = 0;i < arr.length; i++) {
            arr[i] = 1+i;
            System.out.println(arr[i]);
        }
    }
}
