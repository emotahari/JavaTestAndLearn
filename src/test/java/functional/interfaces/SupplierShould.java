package functional.interfaces;

import football.player.Player;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

import static org.assertj.core.api.Assertions.assertThat;

public class SupplierShould {
    @Test
    void have_any_entry_and_return_a_type(){
        Supplier<Player> hossein = () -> new Player("hossein", 98);
        assertThat(hossein.get().getName()).isEqualTo("hossein");
        assertThat(hossein.get().getGoal()).isEqualTo(98);

        int var = -1;
        Supplier<Integer> abs = () -> Math.abs(var);

        assertThat(abs.get()).isEqualTo(1);

    }

    @Test
    void have_any_entry_and_return_a_type_ostad() {
        Supplier<Player> hossein = () -> new Player("Hossein", 95);

        assertThat(hossein.get().getName()).isEqualTo("Hossein");
        assertThat(hossein.get().getGoal()).isEqualTo(95);

        int var = -1;

        // DoubleSupplier doubleSupplier;
        // LongSupplier longSupplier;
        // BooleanSupplier booleanSupplier;
        IntSupplier abs = () -> Math.abs(var);
        final int asInt = abs.getAsInt();

        assertThat(asInt).isEqualTo(1);
    }
}
