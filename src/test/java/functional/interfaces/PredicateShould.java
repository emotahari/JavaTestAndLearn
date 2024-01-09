package functional.interfaces;




import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.Predicate;

public class PredicateShould {
    @Test
    void take_type_as_entry_and_return_boolian(){
        int var = 8;
        Predicate<Integer> isOdd = integer -> integer % 2 == 0;
        boolean result = isOdd.test(var);
        Assertions.assertThat(result).isTrue();
    }
}
