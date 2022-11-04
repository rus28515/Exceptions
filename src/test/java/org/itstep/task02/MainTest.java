package org.itstep.task02;

import org.itstep.task02.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void NegativeNumberExceptionTest (){
        Assertions.assertThrows(Exception.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                Main.getPositiveLessHundredNumber(-1);
            }
        });
    }

    @Test
    public void GreatHundredException (){
        Assertions.assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                Main.getPositiveLessHundredNumber(101);
            }
        });
    }

}