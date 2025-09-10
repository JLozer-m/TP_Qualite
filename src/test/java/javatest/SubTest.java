package javatest;

import mona.Sub;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SubTest {
    @Test
    public void testSub() {
        Sub s = new Sub();
        assertEquals(5, s.sub(10, 5));
        assertEquals(-2, s.sub(3, 5));
    }
}
