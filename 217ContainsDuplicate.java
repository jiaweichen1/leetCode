class Solution {
    public boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) { // Comparison, 
                    return true; // Found a duplicate
                }
            }
        }
        return false; // No duplicates found
    }
}