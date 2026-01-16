package day_41;

class Solution {
    public void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public void sort012(int[] arr) {
        int n = arr.length;
        int i = 0, j = 0, k = n-1;
        while (j <= k) {
            int current = arr[j];
            if (current == 0) {
                swap(arr, i, j);
                i++;
                j++;
            }
            else if (current == 1) {
                j++;
            }
            else {
                swap(arr, j, k);
                k--;
            }
        }
    }
}
