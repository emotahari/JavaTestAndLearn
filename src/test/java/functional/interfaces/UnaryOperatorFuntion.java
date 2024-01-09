package functional.interfaces;

import org.assertj.core.api.AbstractBigDecimalAssert;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.UnaryOperator;

import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;

public class UnaryOperatorFuntion {
    @Test
    void same_type_as_entry_and_return(){
        UnaryOperator<Integer> tavan = integer -> integer * integer;
        Integer var = 2;


        final Integer result = tavan.apply(var);

        Assertions.assertThat(result).isEqualTo(4);
    }


}
