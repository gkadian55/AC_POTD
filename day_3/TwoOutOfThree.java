package day_3;

import java.util.*;
class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Stack<Integer> common = new Stack<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                for (int k = 0; k < nums3.length; k++) {
                    if (nums1[i] == nums2[j] && !common.contains(nums1[i])) common.push(nums1[i]);
                    else if (nums2[j] == nums3[k] && !common.contains(nums2[j])) common.push(nums2[j]);
                    else if (nums1[i] == nums3[k] && !common.contains(nums1[i])) common.push(nums1[i]);
                }
            }
        }
        return common;
    }
}
