package org.itstep.task05;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        // TODO: проверяйте ваш код здесь

        Runner runner = new Runner();

        try {
            runner.halt();
        } catch (RuntimeException e) {
            System.out.println("halt");
        }


    }
}
