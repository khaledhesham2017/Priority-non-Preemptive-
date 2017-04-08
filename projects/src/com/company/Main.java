package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList <Process>  processes = new ArrayList<>();
        Process process1 =new Process();
        Process process2 =new Process();
        Process process3 =new Process();
        Process process4 =new Process();
        Process process5 =new Process();
        process1.setArrivalTime(0);
        process1.setNumber(1);
        process1.setBurstTime(3);
        process1.setPriority(5);
        processes.add(process1);
        process2.setArrivalTime(1);
        process2.setNumber(2);
        process2.setBurstTime(7);
        process2.setPriority(3);
        processes.add(process2);
        process3.setArrivalTime(4);
        process3.setNumber(3);
        process3.setBurstTime(2);
        process3.setPriority(4);
        processes.add(process3);
        process4.setArrivalTime(2);
        process4.setNumber(4);
        process4.setBurstTime(3);
        process4.setPriority(3);
        processes.add(process4);
        process5.setArrivalTime(6 );
        process5.setNumber(5);
        process5.setBurstTime(4);
        process5.setPriority(1);
        processes.add(process5);
        Results results =new Results(processes);
        ArrayList<ProcessResult> processResults =new ArrayList<>();
        processResults =results.getResults();
        int l= processResults.size();
        for (int i=0;i<l;i++){
            System.out.println(i + "- "+ processResults.get(i).getNumber());
            System.out.println(i + "- "+ processResults.get(i).getStartTime());
            System.out.println(i + "- "+ processResults.get(i).getEndTime());
            System.out.println(i + "- "+ processResults.get(i).getWaitingTime());
            System.out.println(i + "- "+ processResults.get(i).getTurnaroundTime());
        }
        System.out.println(results.getAverageWaiting());
        System.out.println(results.getAverageTurnaround());
    }
}
