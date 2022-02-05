package praktikum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Pekhov A.V.
 * @created 05/02/2022 - 11:03
 */

public class BunTest {

    @Test
    public void bunGetNameTest() {
        Bun bun = new Bun("black bun", 80);
        assertEquals("black bun", bun.getName());
    }

    @Test
    public void bunGetPriceTest() {
        Bun bun = new Bun("black bun", 80);
        assertEquals(80, bun.getPrice());
    }
}
