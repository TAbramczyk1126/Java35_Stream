package org.futurecollars.lesson11.task1;

public class Main {
    public static void main(String[] args) {

        int start = 10;
        int end = 100;

        DivisibleByThree.findNumberDivisibleByThree(start,end).stream()
                .forEach(System.out::println);
    }
}
