package org.futurecollars.lesson11.task1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DivisibleByThree {

    public static List<Integer> findNumberDivisibleByThree(int start, int end) {
        return IntStream.rangeClosed(start, end)
                .filter(number -> number % 3 == 0)
                .boxed()
                .collect(Collectors.toList());
    }
}
