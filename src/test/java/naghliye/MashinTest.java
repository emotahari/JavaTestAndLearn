package naghliye;

import naghliye.Mashin;
import org.junit.Test;
import org.junit.gen5.api.Assertions;

public class MashinTest {

    @Test
    public void MashiByadHarkatKonad() {
        // Given
        Mashin benz = new Mashin("Benz");
        benz.RoshanKon();
        Mashin volvo = new Mashin("Volvo");


        //When
        boolean ayaRoshanAst = benz.OnIt();
        boolean ayaVolvoRoshanAst = volvo.OnIt();


        //Then
        Assertions.assertTrue(ayaRoshanAst);
        Assertions.assertFalse(ayaVolvoRoshanAst);


    }
}
