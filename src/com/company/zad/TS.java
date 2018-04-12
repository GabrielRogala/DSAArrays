package com.company.zad;

import com.company.DSATask;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TS implements DSATask {


    @Override
    public void solveTask() {
        System.out.printf("TWO SUM : ");

        int nums[] = new int[]{4,5,3,2,1,6,7};
        int target = 12;

        System.out.println(Arrays.toString(solve(nums,target)));
    }

    private int[] solve(int[] nums, int target) {
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
}
