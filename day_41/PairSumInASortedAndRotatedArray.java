package day_41;


class Solution {
    static boolean pairInSortedRotated(int arr[], int target) {
        int n = arr.length;
        int pivot = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i-1] > arr[i]) {
                pivot = i;
                break;
            }
        }
        int left = (n + pivot) % n;
        int right = (n + pivot - 1) % n;
        while (left != right) {
            int sum = arr[left] + arr[right];
            if (sum == target) return true;
            else if (sum < target) left = (left + 1) % n;
            else right = (right - 1 + n) % n;
        }
        return false;
    }
}
