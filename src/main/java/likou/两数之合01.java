package likou;

import java.util.HashMap;

public class 两数之合01 {
    public static void main(String[] args) {
        int[]  arr = {2,7,11,15};
        int[] ints = twoSum(arr, 9);
        for (int anInt : ints) {
            System.out.println(anInt+"..");
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                arr[1] = i;
                arr[0] = map.get(nums[i]);
            }
            map.put(target-nums[i],i);
        }
        return arr;
    }
}
