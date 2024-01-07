package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPINGTASK = "SHOPING TASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public Task makeTask(String taskClass){
        return switch(taskClass){
            case SHOPPINGTASK -> new ShoppingTask("groceries", "apple", 2);
            case PAINTINGTASK -> new PaintingTask("wall color refresh", "white", "wall");
            case DRIVINGTASK -> new DrivingTask("go to work", "work", "wheelchair");
            default -> null;
        };
    }
}
