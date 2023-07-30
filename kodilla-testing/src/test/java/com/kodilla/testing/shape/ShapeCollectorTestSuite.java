package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Nested
    @DisplayName("TestAddFigure")
    class TestAddFigures{
        @Test
        void testAddShape() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector(){};
            Square square = new Square(3.0);

            //When
            shapeCollector.addFigure(square);

            //Then
            assertEquals(1, shapeCollector.getShapes().size());
        }
    }


    @Nested
    @DisplayName("TestRemoveFigure")
    class TestRemoveShape{
        @Test
        void testRemoveShapeNotExisting() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector(){};
            Square square = new Square(3.0);

            //When
            boolean result = shapeCollector.getShapes().remove(square);

            //Then
            assertFalse(result);
        }

        @Test
        void testRemoveShape() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector(){};
            Square square = new Square(3.0);
            shapeCollector.addFigure(square);

            //When
            boolean result = shapeCollector.getShapes().remove(square);

            //Then
            Assertions.assertTrue(result);
        }
    }

    @Nested
    @DisplayName("TestGetFigure")
    class TestGetFigures{

        @Test
        void testGetShape() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector(){};
            Square square = new Square(3.0);
            shapeCollector.addFigure(square);

            //When
            Shape retrievedSquare = shapeCollector.getFigure(0);

            //Then
            assertEquals(square, retrievedSquare);
        }
    }

    @Nested
    @DisplayName("TestGetFigure")
    class TestShowFigures{
        @Test
        void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector() {
            };
            Shape square = new Square(3.0);
            shapeCollector.addFigure(square);
            Shape circle = new Circle(3.0);
            shapeCollector.addFigure(circle);
            Shape triangle = new Triangle(3.0, 3.0);
            shapeCollector.addFigure(triangle);
            StringBuilder showFigures = new StringBuilder();

            //When
            for (int i = 0; i < shapeCollector.getShapes().size(); i++) {
                showFigures.append(shapeCollector.getFigure(i).getShapeName()).append(" ");
            }
            //Then
            assertEquals("Square Circle Triangle ", showFigures.toString());
        }
    }

}
