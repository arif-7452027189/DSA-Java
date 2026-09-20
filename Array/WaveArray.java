public class WaveArray {
    public static void waveArray(int[] arr) {
        for (int i = 0; i < arr.length; i += 2) {
            if (i == arr.length - 1)
                return;
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        waveArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
