package generics;

import naghliye.Kashti;
import naghliye.Mashin;
import naghliye.Naghliyeh;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;

public class WildCardTest {
    @Test
    void should_print_name(){
        List<Naghliyeh> khodroha = asList(new Mashin("NISSAN"), new Kashti());
        printName(khodroha);
        List<Mashin> mashinha = asList(new Mashin("pejo"), new Mashin("Benz"));
        printName(mashinha);
    }

    private void printName(List<? extends Naghliyeh> khodroha){
        for (Naghliyeh naghliyeh : khodroha) {
            System.out.println(naghliyeh.getMark());
        }
    }
}
