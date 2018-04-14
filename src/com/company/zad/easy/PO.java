package com.company.zad.easy;

import com.company.DSATask;

import java.util.Arrays;

public class PO implements DSATask {
    @Override
    public void solveTask() {
        System.out.printf("Plus one : ");
        int[] tab = new int[]{9,9,9,9,9};

        System.out.println(Arrays.toString(solution(tab)));
    }

    private int[] solution(int[] tab) {
        int n = tab.length;
        for(int i = n-1; i>=0; i--){
            if(tab[i] < 9){
                tab[i]++;
                return tab;
            }

            tab[i] = 0;
        }

        int[] newNumber = new int [n+1];
        newNumber[0] = 1;

        return newNumber;
    }
}
