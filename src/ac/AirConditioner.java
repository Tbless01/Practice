package ac;

public class AirConditioner {

    private int temperature;
    private boolean powerUp = true;


    public int getTemperature() {

        return temperature;
    }

    public boolean getPower() {
        return powerUp;
    }

    public void airConditionerPowerTest(boolean ignite) {
        if (powerUp != ignite) {
            powerUp = false;

        }

    }
}


