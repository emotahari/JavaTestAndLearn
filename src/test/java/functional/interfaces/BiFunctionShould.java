package functional.interfaces;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class BiFunctionShould {

    @Test
    void take_two_entry_and_return_one(){
        Map<String , Integer> player = new HashMap<>();
        player.put("ali", 97);
        player.put("sahand", 21);
        BiFunction<String, Integer, Integer> biFunction = (key , value) -> key.contains("h")? value + 1 : value - 1;
        Integer ali = player.compute("ali", biFunction);
        Integer sahand = player.compute("sahand", biFunction);


        Assertions.assertThat(ali).isEqualTo(96);
        Assertions.assertThat(sahand).isEqualTo(22);


    }

}
