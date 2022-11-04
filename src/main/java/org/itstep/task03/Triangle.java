package org.itstep.task03;

public class Triangle {
    private final int sideOne;
    private final int sideTwo;
    private final int sideThree;

    public Triangle(int sideOne, int sideTwo, int sideThree) throws CreateTriangleException {
        if (sideOne + sideTwo <= sideThree || sideOne + sideThree <= sideTwo || sideTwo + sideThree <= sideOne) {
            throw new CreateTriangleException();
        }

        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }


    public int getSideOne() {
        return sideOne;
    }

    public int getSideTwo() {
        return sideTwo;
    }

    public int getSideThree() {
        return sideThree;
    }
}

class CreateTriangleException extends Exception{
}
