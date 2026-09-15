// Revers Array 
// input = {1,2,3,4,5,6};
// output = {6,5,4,3,2,1}

public class ReverseArray {
    public static void reverseArray(int[] arr) {
        int first = 0;
        int last = arr.length - 1;
        while (first < last) {
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        reverseArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
