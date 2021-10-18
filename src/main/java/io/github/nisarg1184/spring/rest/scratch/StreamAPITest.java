package io.github.nisarg1184.spring.rest.scratch;

import java.util.stream.Stream;

public class StreamAPITest {
    public static void main(String[] args) {
        Stream<Integer> streamOfInt = Stream.of(10, 20, 30, 40, 50, 60);
        System.out.println("Take while:");
        streamOfInt.takeWhile(x -> x < 40).forEach(n -> System.out.println("Value:"+ n));
        Stream<Integer> streamOfInt1 = Stream.of(10, 20, 30, 40, 50, 60);
        System.out.println("Drop while:");
        streamOfInt1.dropWhile(x -> x < 40).forEach(n -> System.out.println("Value:"+ n));
     }
}
