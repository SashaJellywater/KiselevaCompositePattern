package CompositePattern;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BoxComponentTest {

    @Test
    void testAddRemoveSweets() {
        Component box  = new BoxComponent();

        Component cookie = new SweetComponent(1);
        box.add(cookie);

        Assertions.assertEquals(1, box.count());

        box.remove(cookie);
        Assertions.assertEquals(0, box.count());
    }
}
