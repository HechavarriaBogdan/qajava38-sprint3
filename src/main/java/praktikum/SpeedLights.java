package praktikum;

public class SpeedLights {

    /**
     * нет превышения - green
     * есть превышение <= 20 - yellow
     * есть превышение > 20 - red
     */

    public String showLight(int currentSpeed) {
        if (currentSpeed < 0) {
            throw new IllegalArgumentException("Current speed can not be negative");
        }

        if (currentSpeed <= 60)
            return "green";
        else if (currentSpeed <= 80)
            return "yellow";
        else
            return "red";
    }
}
