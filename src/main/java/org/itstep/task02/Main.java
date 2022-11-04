package org.itstep.task02;

public class Main {

    public static void getPositiveLessHundredNumber  (int a) throws NegativeNumberException {
        if (a<0){
            throw  new NegativeNumberException();
        } else if (a>100){
            throw new GreatHundredException();
        }

    }

    public static void main(String[] args)  throws NegativeNumberException{

        getPositiveLessHundredNumber(-105);

    }
}

class NegativeNumberException extends Exception{
}

class GreatHundredException extends RuntimeException{
}
