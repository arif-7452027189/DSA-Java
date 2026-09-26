// package BinarySearch;

public class SearchSortedandRoatated {
    public static int searchRoatated(int[] arr, int target) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[low] <= arr[mid]) {
                if (arr[low] < target && target < arr[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            } else {
                if (arr[mid] < target && target < arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 8, 9, 10, 1, 2, 3 };
        int target = 10;
        System.out.println(searchRoatated(arr, target));
    }
}
