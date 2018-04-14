package com.company.zad.easy;

import com.company.DSATask;

public class SIP implements DSATask {

    @Override
    public void solveTask() {
        System.out.printf("Serch insert position : ");
        int[] tab = new int[]{1,5,7,11,14,24,57,123};
        int newValue = 6;
        int existingValue = 14;
        System.out.println(serchInsert(tab,newValue)+"  "+serchInsert(tab, existingValue));
    }

    private int serchInsert(int[] tab, int target) {
        int start = 0;
        int end = tab.length-1;
        int middle = 0;

        while(end>=start){
            middle = (end+start)/2;
            if(target == tab[middle]){
                return middle;
            }else if (tab[middle] > target){
                end = middle-1;
            } else {
                start = middle+1;
            }
        }
        return start;
    }
}
