package functionalinterface.function;

import java.util.function.BiFunction;

public class BiFunctionDemo {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> f1= (i, j)->(i*j);
        System.out.println(f1.apply(20,30));

        BiFunction<String,String,String> f2=(s1,s2)->(s1+s2);
        System.out.println(f2.apply("Raj","Kumar"));
    }
}
