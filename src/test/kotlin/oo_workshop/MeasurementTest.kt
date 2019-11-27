package oo_workshop

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MeasurementTest {

    @Test
    internal fun equality() {
        assertEquals(1.Gallons, 1.Gallons)
        assertNotEquals(1.Gallons, 2.Gallons)

        assertEquals(1.Gallons, 4.Quarts)
        assertEquals(4.Quarts, 1.Gallons)

        assertTrue(1.Gallons == 16.Cups)
        assertTrue(1.1.Gallons > 16.Cups)
        assertFalse(1.0.Gallons > 16.Cups)

        assertEquals((2/3.0).Gallons, (1/3.0).Gallons + (1/3.0).Gallons)
    }

    @Test
    internal fun `to string`() {
        assertEquals("Gallon", Unit.Gallon.toString())
    }
}
