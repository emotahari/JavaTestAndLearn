package functional.interfaces;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import static java.lang.System.out;

public class ConsumerShould {
    @Test
    void takes_enteries_and_return_nothing(){
        List<Integer> newNumbers  = new ArrayList<>();
        List<Integer> numbers  = new ArrayList<>();
        numbers.add(1);
        numbers.add(5);

        Consumer<? super Integer> consumer = out::println; // bd.save(integer)
        numbers.forEach(consumer);


        Consumer<? super Integer> copy = newNumbers::add;
        numbers.forEach(copy);

        // IntConsumer intConsumer;
        // DoubleConsumer doubleConsumer;
        // LongConsumer longConsumer;

    }
}
