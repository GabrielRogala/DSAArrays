package com.company.zad.easy;

import com.company.DSATask;

import java.util.Arrays;

public class MSA implements DSATask {
    @Override
    public void solveTask() {
        System.out.printf("Merge sorted array : ");

        int[] tab1 = new int[]{1,3,5,7,8,13,15,4,6,8,30,32,56};
        int[] tab2 = new int[]{4,6,8,30,32,56};

        System.out.println(Arrays.toString(solution(tab1,7,tab2,6)));
    }

    private int[] solution(int[] tab1, int size1,  int[] tab2, int size2) {
        int n = size1 + size2 - 1;
        int iter1 = size1 - 1;
        int iter2 = size2 - 1;

        while(iter1 > -1 && iter2 > -1){
            tab1[n--] = (tab2[iter2] > tab1[iter1]) ? tab2[iter2--] : tab1 [iter1--];
        }

        while(iter2 > -1){
            tab1[n--] = tab2[iter2--];
        }

        return tab1;
    }
}
