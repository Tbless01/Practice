//package bike;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class AutomaticBikeTest {
//
//    @Test
//    public void AutomaticBikeOnTest() {
//        AutomaticBike myAutoBike = new AutomaticBike();
//        myAutoBike.automaticBikePower(true);
//        String myAutomaticBikeOnOrOff = myAutoBike.getBikeOnAndOff();
//        assertEquals("on", myAutomaticBikeOnOrOff);
//
//    }
//
//    @Test
//    public void AutomaticBikeOffTest() {
//        AutomaticBike myAutoBike = new AutomaticBike();
//        myAutoBike.automaticBikePower(false);
//        String myAutomaticBikeOnOrOff = myAutoBike.getBikeOnAndOff();
//        assertEquals(false, myAutomaticBikeOnOrOff);
//
//    }
//
//
//    @Test
//    public void AutomaticBikeGearOneAcceleration() {
//        AutomaticBike myAutoBike = new AutomaticBike();
//        myAutoBike.automaticBikeAcceleration(1);
//        myAutoBike.automaticBikeAcceleration(15);
//        myAutoBike.automaticBikeAcceleration(16);
//        int myAutoBikeGear = myAutoBike.getGear();
//        assertEquals(1, myAutoBikeGear);
//    }
//
//    @Test
//    public void AutomaticBikeGearTwoAcceleration() {
//        AutomaticBike myAutoBike = new AutomaticBike();
//        myAutoBike.automaticBikeAcceleration(1);
//        myAutoBike.automaticBikeAcceleration(26);
//        int myAutoBikeGear = myAutoBike.getGear();
//        assertEquals(2, myAutoBikeGear);
//
//    }
//    @Test
//    public void AutomaticBikeGearThreeAcceleration() {
//        AutomaticBike myAutoBike = new AutomaticBike();
//        myAutoBike.automaticBikeAcceleration(1);
//        myAutoBike.automaticBikeAcceleration(15);
//        myAutoBike.automaticBikeAcceleration(35);
//        myAutoBike.automaticBikeAcceleration(38);
//        int myAutoBikeGear = myAutoBike.getGear();
//        assertEquals(3, myAutoBikeGear);
//
//    }
//
//    @Test
//        public void AutomaticBikeGearFourAcceleration() {
//        AutomaticBike myAutoBike = new AutomaticBike();
//        myAutoBike.automaticBikeAcceleration(1);
//        myAutoBike.automaticBikeAcceleration(44);
//        myAutoBike.automaticBikeAcceleration(48);
//        int myAutoBikeGear = myAutoBike.getGear();
//        assertEquals(4, myAutoBikeGear);
//        }
//
//   @Test
//        public void AutomaticBikeBreakDeceleration(){
//        AutomaticBike myAutoBike = new AutomaticBike();
//        myAutoBike.automaticBikeDeceleration(5);
//       myAutoBike.automaticBikeDeceleration(2);
//        int myAutoBikeBreak = myAutoBike.getGear();
//        assertEquals(3,myAutoBikeBreak);
//   }
//}
//
