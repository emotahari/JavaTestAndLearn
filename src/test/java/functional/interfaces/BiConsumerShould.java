package functional.interfaces;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.ObjLongConsumer;

public class BiConsumerShould {
    @Test
    void take_two_entries_and_return_nothing(){
        Map<String, Integer> players = new HashMap<>();
        Map<String, Integer> newplayers = new HashMap<>();
        players.put("majid", 6);
        players.put("mohsen", 7);
        BiConsumer<? super String, ? super Integer > biConsumer = (key, value) -> System.out.println("Player name is" + key + "And score is " + value);
        players.forEach(biConsumer);
        // assert nadare
        BiConsumer<? super String, ? super Integer > copy = newplayers::put;
        players.forEach(copy);

        Assertions.assertThat(players).isEqualTo(newplayers);

        // ObjLongConsumer objLongConsumer;
        // ObjIntConsumer objIntConsumer;
        // ObjDoubleConsumer objDoubleConsumer;
    }
}
