class Solution {
    public int firstMissingPositive(int[] nums) {
        int i;
        HashSet<Integer> set = new HashSet<>();
        for(i=0;i<nums.length;i++)
        set.add(nums[i]);
        i=1;
        while(i<=nums.length){
            if(set.contains(i))
            i++;
            else
            return i;
        }
        return i;
    }
}