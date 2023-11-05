package naghliye;

import naghliye.*;
import org.junit.Test;
import org.junit.gen5.api.Assertions;

public class NameNaghliyeChopKonTest {

    @Test
    public void Bayad_Name_Khodro_Ra_Chop_Konad(){
        //GIVEN
        Mashin benz = new Mashin("Benz",120,"Automatic");
        Naghliyeh volvo = new Mashin("Volvo",110, "dasti");
        Naghliyeh motor = new Motor();
        Naghliyeh kashti = new Kashti();
        Naghliyeh[]  naghliyaha = {benz, volvo, motor, kashti};
        NameKhodroChopKon nameKhodroChopKon = new NameKhodroChopKon(naghliyaha);

        //When
        String listNameKhodro = nameKhodroChopKon.execute();


        //Then
        Assertions.assertEquals("Benz-Volvo-Motor-Kashti",listNameKhodro);

    }

}
