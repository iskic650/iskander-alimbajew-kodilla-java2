package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertSame;

@SpringBootTest
public class BoardTestSuite {
    @Test
    void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(Board.class);
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().tasks.add("z1");
        board.getInProgressList().tasks.add("z2");
        board.getDoneList().tasks.add("z3");

        String z1 = board.getToDoList().tasks.get(0);
        String z2 = board.getInProgressList().tasks.get(0);
        String z3 = board.getDoneList().tasks.get(0);

        //Then
        assertSame(z1, "z1");
        assertSame(z2, "z2");
        assertSame(z3, "z3");
    }
}
