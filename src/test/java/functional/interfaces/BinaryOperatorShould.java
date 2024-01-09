package functional.interfaces;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.BinaryOperator;

public class BinaryOperatorShould {
    @Test
    void two_entry_and_one_output_by_same_type(){
        BinaryOperator<Integer> multiply = (int1,int2) -> int1 * int2;
        Integer int2 = 4;
        Integer int1 = 5;
        Integer result = multiply.apply(int1,int2);

        Assertions.assertThat(result).isEqualTo(20);

    }

}
