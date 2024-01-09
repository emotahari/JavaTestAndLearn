package functional.interfaces;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class FunctionShould {
    //Function:
    // yek method abstract ast ke yek type be onvane voroodi daryaft mikone
    // va yek type be onvane khorooji bar migardoone

    @Test
    void get_an_entry_and_produce_an_output(){
        Map<String, Integer> map = new HashMap<>();
        Function<? super String, Integer> function = key -> key.length();
        Function<? super String, Integer> function1 = String::length; // method refrence
        final Integer result = map.computeIfAbsent("sepehr", function);




    }

}
