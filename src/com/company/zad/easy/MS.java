package com.company.zad.easy;

import com.company.DSATask;

import java.util.Arrays;

public class MS implements DSATask {

    @Override
    public void solveTask() {
        System.out.printf("Maximum subarray : ");
        int[] tab = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println(solution(tab));
    }

    private int solution(int[] tab) {
        int[] tmp = new int[tab.length];
        tmp[0] = tab[0];
        int max = tmp[0];

        for (int i = 1; i < tab.length; i++) {
            tmp[i] = tab[i] + (tmp[i - 1] > 0 ? tmp[i - 1] : 0);
            max = Math.max(max, tmp[i]);
        }
        return max;
    }

}
