package com.company.zad.easy;

import com.company.DSATask;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TS implements DSATask {


    @Override
    public void solveTask() {
        System.out.printf("Two sum : ");

        int nums[] = new int[]{4,5,3,2,1,6,7};
        int target = 12;

        System.out.println(Arrays.toString(solution(nums,target)));

        System.out.printf("Two sum 2: ");
        nums = new int[]{2,7,11,15,30,34};
        target = 37;
        System.out.println(Arrays.toString(solution2(nums,target)));
    }

    private int[] solution(int[] nums, int target) {
        int[] result = new int[2];

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0 ; i < nums.length ;i++){
            Integer val = map.get(target - nums[i]);

            if(val == null){
                map.put(nums[i],i);
            }else{
                result[0] = i;
                result[1] = val;
                break;
            }
        }

        return result;
    }

    private int[] solution2(int[] nums, int target) {
        int[] result = new int[2];

        if(nums == null || nums.length < 2)
            return null;

        int left = 0;
        int right = nums.length-1;


        while(left < right){
            int v =  nums[left]+nums[right];
            if(target == v){
                result[0] = left;
                result[1] = right;
                return result;
            }else if(v > target){
                right--;
            }else{
                left++;
            }
        }

        return null;
    }
}
