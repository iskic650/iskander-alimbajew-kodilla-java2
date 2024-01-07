package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskFactoryTestSuite {
    @Test
    void testFactoryShoppingTask(){
        //given
        TaskFactory taskFactory = new TaskFactory();
        // when
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPINGTASK);
        Task shoppingTaskExpected = new ShoppingTask("groceries", "apple", 2);
        //then
        assertEquals(shoppingTaskExpected.getTaskName(), shoppingTask.getTaskName());
        assertEquals(((ShoppingTask) shoppingTaskExpected).getWhatToBuy(), ((ShoppingTask) shoppingTask).getWhatToBuy());
        assertEquals(((ShoppingTask) shoppingTaskExpected).getQuantity(), ((ShoppingTask) shoppingTask).getQuantity());
    }

    @Test
    void testFactoryPaintingTask(){
        //given
        TaskFactory taskFactory = new TaskFactory();
        // when
        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTINGTASK);
        Task paintingTaskExpected = new PaintingTask("wall color refresh", "white", "wall");
        //then
        assertEquals(paintingTaskExpected.getTaskName(), paintingTask.getTaskName());
        assertEquals(((PaintingTask) paintingTaskExpected).getColor(), ((PaintingTask) paintingTask).getColor());
        assertEquals(((PaintingTask) paintingTaskExpected).getWhatToPaint(), ((PaintingTask) paintingTask).getWhatToPaint());
    }

    @Test
    void testFactoryDrivingTask(){
        //given
        TaskFactory taskFactory = new TaskFactory();
        // when
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVINGTASK);
        Task drivingTaskExpected = new DrivingTask("go to work", "work", "wheelchair");
        //then
        assertEquals(drivingTaskExpected.getTaskName(), drivingTask.getTaskName());
        assertEquals(((DrivingTask) drivingTaskExpected).getWhere(), ((DrivingTask) drivingTask).getWhere());
        assertEquals(((DrivingTask) drivingTaskExpected).getUsing(), ((DrivingTask) drivingTask).getUsing());
    }

    @Test
    void testExecuteTask(){
        //given
        Task shoppingTask = new ShoppingTask("groceries", "apple", 2);
        Task shoppingTaskExecuted = new ShoppingTask("groceries", "apple", 2);
        Task paintingTask = new PaintingTask("wall color refresh", "white", "wall");
        Task paintingTaskExecuted = new PaintingTask("wall color refresh", "white", "wall");
        Task drivingTask = new DrivingTask("go to work", "work", "wheelchair");
        Task drivingTaskExecuted = new DrivingTask("go to work", "work", "wheelchair");
        //then
        shoppingTaskExecuted.executeTask();
        paintingTaskExecuted.executeTask();
        drivingTaskExecuted.executeTask();
        //then
        assertEquals(shoppingTask.isTaskExecuted(), false);
        assertEquals(shoppingTaskExecuted.isTaskExecuted(), true);
        assertEquals(paintingTask.isTaskExecuted(), false);
        assertEquals(paintingTaskExecuted.isTaskExecuted(), true);
        assertEquals(drivingTask.isTaskExecuted(), false);
        assertEquals(drivingTaskExecuted.isTaskExecuted(), true);
    }
}
