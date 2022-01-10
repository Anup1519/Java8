package functionalinterface.stream;


import java.util.stream.Stream;

public class NumberFilter {
    public static void main(String[] args) {
        Stream<Integer> stream=Stream.of(4,6,56,28,15,3);
        //Using Lambda expression
        Stream<Integer> stream1 = stream.filter(i ->i
                >= 8);
        stream1.forEach(i-> System.out.println(i));

        //Using Method Reference
      /*  stream.filter(i->i>=8)               //java.lang.IllegalStateException: stream has already been operated upon or closed
                .forEach(System.out::println); */
    }
}
