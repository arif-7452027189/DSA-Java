public class MissingNumber {
    public static int missingNumber(int[] arr) {
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        int arrSum = 0;
        for (int ele : arr) {
            arrSum += ele;
        }
        return sum - arrSum;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 6, 4, 7, 8, 9, 10, 20 };
        System.out.println(missingNumber(arr));
    }
}
