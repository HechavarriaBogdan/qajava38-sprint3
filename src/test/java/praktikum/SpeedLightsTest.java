package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SpeedLightsTest {

    private final String expectedColor;
    private final int currentSpeed;

    public SpeedLightsTest(String color, int currentSpeed) {
        this.expectedColor = color;
        this.currentSpeed = currentSpeed;
    }


    @Parameterized.Parameters(name = "expected light {0}, speed {1}")
    /**
     * {0} - это первый элемент массива
     * {1} - это второй элемент массива
     */
    public static Object[][] dataGenerator() {
        return new Object[][]{
                {"green", 50},
                {"yellow", 80},
                {"red", 81},
                {"red", 81},

        };

    }

    @Test
    public void extracted() {
        var speedLights = new SpeedLights();
        assertEquals(expectedColor, speedLights.showLight(currentSpeed));
    }
}