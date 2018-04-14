package com.company.zad.easy;

import com.company.DSATask;

public class RE implements DSATask {
    @Override
    public void solveTask() {
        System.out.printf("Remove element : ");
        int[] tab = new int[]{3,2,2,3};
        int val = 3;
        System.out.println(solution(tab,val));
    }

    private int solution(int[] tab, int val){
        int j = 0;

        for(int i = 0 ; i<tab.length ; i++){
            if(val != tab[i]){
                tab[j++] = tab[i];
            }
        }

        return j;
    }


}
