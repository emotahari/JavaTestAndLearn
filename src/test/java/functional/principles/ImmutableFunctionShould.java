package functional.principles;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ImmutableFunctionShould {
    // Taghi napaziri: vaghti chizi dorost mishe, bad az an digar taghir nemikonad
    @Test
    void never_be_changed_after_being_constructed() {
        int var = 5;      // dorost shode
        //var++;                // taghir meghdar
        Operation operation = number -> number + var;
        final AddOperationTo addOperationTo = addOperationTo(2, operation);

        final int result = addOperationTo.apply();
        assertThat(result).isEqualTo(7);
    }

    private AddOperationTo addOperationTo(int number, Operation operation) {
        return () -> operation.applyOperation(number);
    }

}
