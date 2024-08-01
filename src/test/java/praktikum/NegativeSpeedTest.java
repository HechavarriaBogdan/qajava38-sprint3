package praktikum;

import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class NegativeSpeedTest {

    @Test(expected = IllegalArgumentException.class)
    public void negativeSpeedAreRejected() {
        var speedLights = new SpeedLights();
        speedLights.showLight(-10);
    }

    @Test
    public void negativeSpeedAreRejected2() {
        var speedLights = new SpeedLights();

        assertThrows(IllegalArgumentException.class,
                () -> speedLights.showLight(-10));
    }
}