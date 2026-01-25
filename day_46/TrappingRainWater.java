package day_46;

class Solution {
    public int maxWater(int height[]) {
        int n = height.length;
        int tallest = 0;
        for (int i = 1; i < n; i++) {
            if (height[i] > height[tallest]) tallest = i;
        }
        int left = 0;
        for (int i = 0; i < tallest-1; i++) {
            if (height[i] > height[i+1]) {
                left = i;
                break;
            }
        }
        int right = n-1;
        for (int i = n-1; i > tallest+1; i--) {
            if (height[i] > height[i-1]) {
                right = i;
                break;
            }
        }
        int water = 0;
        while (left < tallest) {
            int i = left + 1;
            while (i < tallest && height[i] < height[left]) {
                water += height[left] - height[i];
                i++;
            }
            left = i;
        }
        while (right > tallest) {
            int i = right - 1;
            while (i > tallest && height[i] < height[right]) {
                water += height[right] - height[i];
                i--;
            }
            right = i;
        }
        return water;
    }
}

