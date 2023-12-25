package functional.principles;

import com.sun.org.apache.xpath.internal.operations.Operation;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class HigherOrderFunction {
    // martabe balatar
    // 1- mitune yek ya chand function ra be onvan parametr begire
    // 2- mitune yek function ra bargardune


    @Test
    void take_one_or_many_other_function_as_parameter_and_return_a_function() {


        // Function = SAM (Single Abstract Method)
        Operation operation = number -> number + 5;
        final AddOperationTo addOperationTo = addOperationTo(2, operation);
        final int result = addOperationTo.apply();
        Assertions.assertThat(result).isEqualTo(7);

        Operation tavan = number -> number * number;
        final AddOperationTo beTvanBeresan = addOperationTo(5, tavan);
        final int adadBeTavan2  = beTvanBeresan.apply();
        Assertions.assertThat(adadBeTavan2).isEqualTo(25);


        }

    private AddOperationTo addOperationTo(int number, Operation operation) {
        return () -> operation.applyOperation(number);


    }
    @FunctionalInterface
    interface Operation {
        int applyOperation(int number);
        default int another(int number) {
            return 0;
        }

    }
    @FunctionalInterface
    interface AddOperationTo {
        int apply();
    }


}
