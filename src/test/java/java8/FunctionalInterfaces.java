package java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Created by Administrator on 2018/5/3.
 */
public class FunctionalInterfaces {
    public static void main(String args[]) {
        testFunction();

        testConsumer();

        testPredicate();

        testSupplier();
    }

    public static void testFunction(){
        //注意泛型 andThen顺序不能换
        Function<Integer, String> function1 = (x) -> "test result: " + x;

        //标准的,有花括号, return, 分号.
        Function<String, String> function2 = (x) -> {
            return "after function1";
        };
        System.out.println(function1.apply(6));

        System.out.println(function1.andThen(function2).apply(6));
        System.out.println(function2.compose(function1).apply(6));
    }

    public static void testSupplier(){
        //简写
        Supplier<String> supplier1 = () -> "Test supplier";
        System.out.println(supplier1.get());

        //标准格式
        Supplier<Integer> supplier2 = () -> {
            return 20;
        };
        System.out.println(supplier2.get() instanceof Integer);
    }

    public static void testConsumer(){
        Consumer<String> consumer1 = (x) -> System.out.print(x);
        Consumer<String> consumer2 = (x) -> {
            System.out.println(" after consumer 1");
        };
        consumer1.andThen(consumer2).accept("test consumer1");
    }

    public static void testPredicate(){
        Predicate<String> predicate = (x) -> x.length() > 0;
        System.out.println(predicate.test("String"));
    }
}
