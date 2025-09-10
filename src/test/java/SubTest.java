package main.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SubTest {
    @Test
    public void testSub() {
        sub s = new sub();
        assertEquals(5, s.sub(10, 5));
        assertEquals(-2, s.sub(3, 5));
    }
}
