package org.itstep.task04;

import org.itstep.task04.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class MainTest {

    @Test
    public void ArrayNotSorted() {
        Assertions.assertThrows(Exception.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                Main.binarySearch(new int[]{1, 8, 3, 4, 5}, 4);
            }
        });
    }
}
