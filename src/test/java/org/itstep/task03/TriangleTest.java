package org.itstep.task03;

import org.itstep.task03.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class TriangleTest {

    @Test
    public void TriangleException(){
        Assertions.assertThrows(Exception.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                Triangle triangle = new Triangle(2,2,5);
            }
        });
    }
}
