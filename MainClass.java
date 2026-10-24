import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MainClass {

    public static void main(String[] args) {

        // Predicate -->> test
        Predicate<Integer> isQualifeied = x -> (x > 10);
        System.out.println(isQualifeied.test(10));

        // Function --> apply
        Function<Integer, String> fn = x -> x.toString();
        System.out.println(fn.apply(101));

        // Spuulier --> get
        Supplier<Double> sp = ()-> Math.random();
        System.out.println(sp.get());

        // Consumer --> accept
        Consumer<Integer> cm = (x) -> System.out.println(x);
        cm.accept(10);
    }
}
