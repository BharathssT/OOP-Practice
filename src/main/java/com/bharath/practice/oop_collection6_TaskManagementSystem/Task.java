package com.bharath.practice.oop_collection6_TaskManagementSystem;

public class Task {

    private int taskId;
    private String title;
    private int priority;
    private boolean completed;

    public Task(int taskId, String title, int priority, boolean completed){
        this.taskId = taskId;
        this.title = title;
        this.priority = priority;
        this.completed = completed;
    }

    public int getTaskId(){return taskId;}
    public String getTitle(){return title;}
    public int getPriority(){return priority;}
    public boolean isCompleted(){return completed;}

    @Override
    public String toString(){
        return "Task id: " + taskId + "\nTitle: " + title + "\nPriority: " + priority + "\nCompleted: " + completed;
    }
}
