public class SecondLargestElements {

    public static int secLar(int[] arr) {

        int max = Integer.MIN_VALUE;

        // Find maximum
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int secMax = Integer.MIN_VALUE;

        // Find second largest
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < max && arr[i] > secMax) {
                secMax = arr[i];
            }
        }

        return secMax;
    }

    public static void main(String[] args) {

        int[] arr = { 4, 2, 6, 8, 9, 8, 7, 10 };

        System.out.println(secLar(arr));
    }
}