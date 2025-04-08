public class ArraySum {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for(int i = 0;i < arr1.length; i++) {
            sum += arr1[i]; // sum = sum + arr[i]
        }

        System.out.println(sum);
    }
}