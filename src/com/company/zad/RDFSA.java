package com.company.zad;

import com.company.DSATask;


public class RDFSA implements DSATask {
    @Override
    public void solveTask() {
        System.out.printf("Remove duplicates from sorted array : ");

        int[] tab = new int[]{1,1,1,2,2,3,4,6,7,8,8};

        System.out.println(solve(tab));
    }

    private int solve(int[] tab) {

        if(tab.length == 0){
            return 0;
        }

        int result = 0;

        for(int i=0; i<tab.length; i++){
            if(tab[result] != tab[i]){
                tab[++result] = tab[i];
            }
        }

        return ++result;
    }


}
