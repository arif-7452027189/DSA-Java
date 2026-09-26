// package BinarySearch;

public class SqrNumber {
    public static int sqrNumber(int num) {
        if (num == 0)
            return 0;
        int low = 1;
        int high = num;
        while (low <= high) {
            int mid = low + (high - low);
            if (mid == num / mid)
                return mid;
            if (mid > num / mid)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return high;
    }

    public static void main(String[] args) {
        int num = 82;
        System.out.println(sqrNumber(num));
    }
}
