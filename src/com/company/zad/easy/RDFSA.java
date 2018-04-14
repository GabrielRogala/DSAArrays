package com.company.zad.easy;

import com.company.DSATask;


public class RDFSA implements DSATask {
    @Override
    public void solveTask() {
        System.out.printf("Remove duplicates from sorted array : ");

        int[] tab = new int[]{1,1,1,2,2,3,4,6,7,8,8};

        System.out.println(solution(tab));
    }

    private int solution(int[] tab) {

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
