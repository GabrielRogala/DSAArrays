package com.company;

import com.company.zad.easy.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<DSATask> tasks = new ArrayList<>();

        tasks.add(new TS());
        tasks.add(new RDFSA());
        tasks.add(new RE());
        tasks.add(new SIP());
        tasks.add(new MS());
        tasks.add(new PO());
        //add new task

        for(DSATask t : tasks) {
            t.solveTask();
        }

    }
}
