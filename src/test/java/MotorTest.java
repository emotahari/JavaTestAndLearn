import naghliye.Mashin;
import naghliye.Motor;
import org.junit.Test;
import org.junit.gen5.api.Assertions;

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
