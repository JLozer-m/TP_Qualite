package javatest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import mona.Add;

public class AddTest {

    @Test
    public void testAdd() {
        Add addObj = new Add();
        assertEquals(5, addObj.add(2, 3));
    }
}
