package functionalinterface.function;

import java.util.function.Function;

public class FunctionDemo {

    public static <Person> void main(String[] args){
        Function<String, String> f1= (s)->s.toUpperCase();
        System.out.println(f1.apply("Anup kumar"));

        Function<Integer, Integer> f2=(i)->(i*i);
        System.out.println(f2.apply(20));

    }
}

