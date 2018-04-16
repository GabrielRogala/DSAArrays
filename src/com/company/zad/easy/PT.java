package com.company.zad.easy;

import com.company.DSATask;

import java.util.ArrayList;
import java.util.List;

public class PT implements DSATask {
    @Override
    public void solveTask() {
        System.out.printf("Pascal triangle : ");
        int row = 6;
        System.out.println(solution(row));

        System.out.printf("Pascal triangle II : ");
        row = 6;
        System.out.println(solution2(row));
    }

    private List<Integer> solution2(int row) {
        List<Integer> list = new ArrayList<>();

        if(row < 0 )
            return list;

        list.addAll(solution2(row -1));
        list.add(0,1);

        for(int i = 1; i < row ; i++) {
            list.set(i,list.get(i) + list.get(i+1));
        }

        return list;
    }



    private List<List<Integer>> solution(int row) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> listRow = new ArrayList<Integer>();
        listRow.add(1);
        list.add(listRow);

        for(int i = 1; i < row ; i++){
            List<Integer> listTmp = new ArrayList<Integer>(list.get(i-1));
            listTmp.add(0);
            list.add(listTmp);

            if(i>1){
                for(int j = 0; j < i ; j++){
                    list.get(i).set(j+1,list.get(i).get(j+1) + list.get(i-1).get(j));
                }
            }else{
                list.get(i).set(1,list.get(i-1).get(0));
            }

        }

        return list;
    }
}
