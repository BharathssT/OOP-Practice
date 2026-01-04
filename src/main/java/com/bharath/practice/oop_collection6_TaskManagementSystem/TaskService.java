package com.bharath.practice.oop_collection6_TaskManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class TaskService {

    List<Task> taskList = new ArrayList<>();

    public void addTask(Task task){
        taskList.add(task);
    }

    public void viewAllTasks(){
        for(Task task : taskList){
            System.out.println(task);
        }
    }

    public void filterByPriority(int priority) {
        for(Task task : taskList){
            if(task.getPriority() == priority){
                System.out.println(task);
            }
        }
    }
}
