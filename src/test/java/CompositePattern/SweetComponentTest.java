package CompositePattern;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SweetComponentTest {
    @Test
    void testCountSweets() {
        Component sweet = new SweetComponent(3);
        Assertions.assertEquals(3, sweet.count());
    }

    @Test
    void testAddMethodError() {
        Component sweet = new SweetComponent(1);
        Exception exception = Assertions.assertThrows(UnsupportedOperationException.class, () -> {
            sweet.add(new SweetComponent(1));
        });

        String expectedMessage = "Метод add не применим к отдельной сладости";
        String actualMessage = exception.getMessage();

        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void testRemoveMethodError() {
        Component sweet = new SweetComponent(1);
        Exception exception = Assertions.assertThrows(UnsupportedOperationException.class, () -> {
            sweet.remove(new SweetComponent(1));
        });

        String expectedMessage = "Метод remove не применим к отдельной сладости";
        String actualMessage = exception.getMessage();

        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }
}
