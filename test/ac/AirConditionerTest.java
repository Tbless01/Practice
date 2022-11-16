package ac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirConditionerTest {


    @Test
    public void airConditionerOnTest() {
        AirConditioner myAirConditioner = new AirConditioner();
        myAirConditioner.airConditionerPowerTest(false);
        boolean myAirConditionerOn = myAirConditioner.getPower();
        assertEquals(false, myAirConditionerOn);

    }


    @Test
    public void airConditionerOffTest() {
        AirConditioner myAirConditioner = new AirConditioner();
        myAirConditioner.airConditionerPowerTest(true);
        boolean myAirConditionerOnOrOff = myAirConditioner.getPower();
        assertEquals(true, myAirConditionerOnOrOff);

    }

}

    @Test





