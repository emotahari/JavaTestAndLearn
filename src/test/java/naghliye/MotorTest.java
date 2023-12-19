package naghliye;

import naghliye.Mashin;
import naghliye.Motor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MotorTest {
    @Test
    public void MotorBayadHarkatKonad(){
        // Given
        Motor benz = new Motor();
        benz.RoshanKon();
        Motor volvo = new Motor();


        //When
        boolean ayaRoshanAst = benz.OnIt();
        boolean ayaVolvoRoshanAst = volvo.OnIt();


        //Then
        Assertions.assertTrue(ayaRoshanAst);
        Assertions.assertFalse(ayaVolvoRoshanAst);
    }
}
