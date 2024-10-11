package org.example;

import org.example.entity.*;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        Set<Task> annsTasks = new HashSet<>();
//        Task taskAnn = new Task("workintech","dumy desc","ann", Status.IN_PROGRESS, Priority.HIGH);
//        Task taskAnn2 = new Task("workintech","dumy desc 2","ann", Status.IN_PROGRESS, Priority.HIGH);
//
//        annsTasks.add(taskAnn);
//        annsTasks.add(taskAnn2);
//
//        Set<Task> bobsTaks = new HashSet<>();
//        Task taskBob = new Task("workintech","dumy desc","bob", Status.IN_PROGRESS, Priority.HIGH);
//        Task taskBob2 = new Task("workintech","dumy desc 2","bob", Status.IN_PROGRESS, Priority.HIGH);
//
//        bobsTaks.add(taskBob);
//        bobsTaks.add(taskBob2);
//
//        Set<Task> carolsTasks = new HashSet<>();
//        Task taskACarol = new Task("workintech","dumy desc3","carol", Status.IN_PROGRESS, Priority.HIGH);
//        Task taskCarol2 = new Task("workintech","dumy desc 4","carol", Status.IN_PROGRESS, Priority.HIGH);
//
//        carolsTasks.add(taskACarol);
//        carolsTasks.add(taskCarol2);
//
//        Set<Task> unassignedTasks = new HashSet<>();
//        Task unassignedTask = new Task("workintech","dumy desc5","null", Status.IN_PROGRESS, Priority.HIGH);
//
//        unassignedTasks.add(unassignedTask);
//        TaskData taskData = new TaskData(annsTasks,bobsTaks,carolsTasks,unassignedTasks );
//
//        System.out.println("bobstasks: " +taskData.getTasks("bob"));
//        System.out.println("annstasks: " +taskData.getTasks("ann"));
//        System.out.println("carolstasks:" +taskData.getTasks("carol"));
//        System.out.println("alltasks: " +taskData.getTasks("all"));
//
//        taskData.getIntersection(annsTasks,bobsTaks);
//        taskData.getIntersection(annsTasks,carolsTasks);
//
//
//        System.out.println(taskData.getDifferences(unassignedTasks,taskData.getTasks("ann")));
//
        StringSet.findUniqueWords();
    }
}