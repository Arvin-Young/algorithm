package com.arvin.array;

public class SearchRange {
    public static void main(String[] args) {
        int[] arr = {5, 7, 8, 8, 9, 9, 9, 10, 10};
        System.out.println(searchRange(arr, 9)[0] + "\t" + searchRange(arr, 9)[1]);
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        int low = 0;
        int high = nums.length - 1;
        int middle = nums.length / 2;
        while (low <= high) {
            if (target < nums[middle]) {
                high = middle;
                middle = low + (high - low) / 2;
            }else if (target > nums[middle]) {
                low = middle;
                middle = low + (high - low) / 2;
            }else {
                int location1 = middle;
                int location2 = middle;
                while (nums[location1] == target) {
                    location1--;
                }
                result[0] = ++location1;
                while (nums[location2] == target) {
                    location2++;
                }
                result[1] = --location2;
                break;
            }
        }
        return result;
    }
}
