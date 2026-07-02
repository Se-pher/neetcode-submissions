class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> stored = new HashMap<>();
        for(int i = 0; i< nums.length;i++){
            int needed = target - nums[i];
            if(stored.containsKey(needed)){
                return new int[]{stored.get(needed),i};
            }
            stored.put(nums[i], i);
        }
        return null;
    }
}
