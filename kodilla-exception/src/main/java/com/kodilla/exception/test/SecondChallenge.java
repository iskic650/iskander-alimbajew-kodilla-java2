package com.kodilla.exception.test;

public class SecondChallenge {

    public String probablyIWillThrowException(double x, double y) throws Exception {
        try {
            if (x >= 2 || x < 1 || y == 1.5) {
                throw new ExceptionHandling("Wrong value of X or Y");
            }
        }catch(ExceptionHandling e){
            System.out.println(e);
            throw new Exception();
        }finally {
            System.out.println("done");
        }
        return "Done!";
    }
}