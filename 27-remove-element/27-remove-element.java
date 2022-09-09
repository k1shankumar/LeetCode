class Solution {
    public int removeElement(int[] nums, int val) {
      int valid = 0;
        int l = nums.length;
    for (int i=0; i<l; i++) {
        if (nums[i]!=val) {
            swap(nums,i,valid++);
        }
    }
    return valid;
}
    void swap(int array[],int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
