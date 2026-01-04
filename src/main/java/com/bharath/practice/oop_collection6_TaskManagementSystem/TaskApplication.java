package com.bharath.practice.oop_collection6_TaskManagementSystem;

public class TaskApplication {

    public static void main(String[] args){
        TaskService taskService = new TaskService();

        Task t1 = new Task(1, "Learn Java", 1, false);
        Task t2 = new Task(2, "Write notes", 2, true);
        Task t3 = new Task(3, "Practice coding", 1, true);
        Task t4 = new Task(4, "Watch tutorial", 3, false);

        taskService.addTask(t1);
        taskService.addTask(t2);
        taskService.addTask(t3);
        taskService.addTask(t4);

        System.out.println("\n--- All Tasks ---");
        taskService.viewAllTasks();

        System.out.println("\n--- Filtering Tasks ---");
        taskService.filterByPriority(1);
        taskService.filterByPriority(3);

    }
}
