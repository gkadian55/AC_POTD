package day_58;

import java.util.* ;

public class DivideChocolates {
	public static int divide(ArrayList<Integer> arr, int mid) {
		int parts = 0;
		int sweetness = 0;
		for (int i = 0; i < arr.size(); i++) {
			sweetness += arr.get(i);
			if (sweetness >= mid) {
				parts++;
				sweetness = 0;
			}
		}
		return parts;
	}
	public static int getMaximumSweetness(ArrayList<Integer> arr, int k) {
		int left = 1;
		int right = 0;
		for (int i = 0; i < arr.size(); i++) right += arr.get(i);
		while (left <= right) {
			int mid = left + (right - left) / 2;
			int expected = divide(arr, mid);
			if (expected >= k + 1) {
				left = mid + 1;
			}
			else right = mid - 1;
		}
		return right;
	}
}
