package CompositePattern;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CompositePatternSweetBoxTest {
    @Test
    void testCountAllComponents() {
        BoxComponent firstBox = new BoxComponent();
        BoxComponent secondBox = new BoxComponent();
        BoxComponent thirdBox = new BoxComponent();

        Component cookie = new SweetComponent(3);
        Component lollipop = new SweetComponent(1);

        firstBox.add(cookie);
        secondBox.add(lollipop);
        secondBox.add(firstBox);
        thirdBox.add(secondBox);

        Assertions.assertEquals(4, thirdBox.count());
    }

    @ParameterizedTest
    @CsvSource({"0, 0", "1, 1", "5, 5", "10, 10"})
    void testCountSweetsInBoxes(int sweetCount, int expectedCount) {
        BoxComponent box = new BoxComponent();
        Component chocolate = new SweetComponent(sweetCount);
        box.add(chocolate);

        Assertions.assertEquals(expectedCount, box.count());
    }
}
