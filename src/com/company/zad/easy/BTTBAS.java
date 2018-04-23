package com.company.zad.easy;

import com.company.DSATask;

import java.util.Arrays;

public class BTTBAS implements DSATask {
    @Override
    public void solveTask() {
        System.out.printf("Best time to buy and sell stock : ");
        int input[] = {7,2,5,4,6,1,2,6};
        System.out.printf(Arrays.toString(input) + "  : ");
        System.out.println(solution(input));

        System.out.printf("Best time to buy and sell stock 2 : ");
        System.out.printf(Arrays.toString(input) + "  : ");
        System.out.println(solution2(input));
    }

    private int solution(int[] input) {
        int maxLocal = 0;
        int maxGlobal = 0;

        for(int i = 1; i< input.length ; i++){
            maxLocal = Math.max(0,maxLocal + input[i] - input[i-1]);
            maxGlobal = Math.max(maxGlobal, maxLocal);
        }

        return maxGlobal;
    }

    private int solution2(int[] input) {
        int result = 0;

        for(int i = 0; i< input.length - 1; i++){
           if(input[i+1] > input[i]){
               result += input[i+1] - input[i];
           }
        }

        return result;
    }
}
